package com.jk.controller.information;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.jk.entity.reception.TInformation;
import com.jk.service.activity.ActivityService;
import com.jk.service.information.InformationService;
import com.jk.util.EmojiFilter;
import com.jk.util.JsonUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * 资讯相关
 */
@Controller
@RequestMapping("/information")
public class InformationController {
    private final Base64.Encoder encoder = Base64.getEncoder();
    private final Base64.Decoder decoder = Base64.getDecoder();
    private final String base64Pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";

    @Autowired
    InformationService informationService;
    @Autowired
    ActivityService activityService;

    /**
     * 进入资讯列表页面
     * @param model
     * @param pid
     * @param id
     * @return
     */
    @RequestMapping(value = "/listInformationView")
    public String listInformationView(Model model, String pid, String id) {
        model.addAttribute("pid",pid);
        model.addAttribute("id",id);
        return "html/reception/information/informationlist";
    }

    /**
     * 资讯列表数据查询（后端）
     * @param tInformation
     * @param rows
     * @return
     */
    @RequestMapping(value = "/listInformation")
    @ResponseBody
    public String listInformation(TInformation tInformation, int rows) throws UnsupportedEncodingException {
        List<TInformation> tInformations = new ArrayList<>();
        PageHelper.startPage(tInformation.getPage(), rows); //分页查询
        List<TInformation> tInformationList = informationService.selectInformation(tInformation);
        for (TInformation information : tInformationList) {
            information.settCreateTime(information.gettCreateTime().substring(5,16));
            if(StringUtil.isNotEmpty(information.gettImg())){
                List<String> listImg = Arrays.asList(information.gettImg().split(","));
                information.setListImg(listImg);
            }
            // 发布内容
            String tContent = information.gettContent();
            // 判断时候Base64编码
            Boolean isLegal = tContent.matches(base64Pattern);
            if (isLegal) {
                //解码
                String tContentData = new String(decoder.decode(tContent), "UTF-8");
                information.settContent(tContentData);
            }
            tInformations.add(information);
        }
        PageInfo<TInformation> pageInfo = new PageInfo<>(tInformationList);
        tInformation.setPageSize(rows);
        tInformation.setRows(tInformations);
        tInformation.setPage(tInformation.getPage());
        tInformation.setTotal(pageInfo.getPages());
        return JsonUtil.toJsonString(tInformation);
    }

    /**
     * 进入修改卡券页面
     * @return
     */
    @RequestMapping(value = "/updInformationView")
    public String updInformationView(String id,Model model) {
        if(StringUtil.isNotEmpty(id)) {
            TInformation tInformation = informationService.selectByPrimaryKey(id);
            tInformation.setUrl(tInformation.gettImg());
            model.addAttribute("tInformation",tInformation);
        }
        return "html/reception/information/informationupd";
    }

    /**
     * 删除资讯信息
     * @param ids
     * @return
     */
    @RequestMapping(value = "/delInformation")
    @ResponseBody
    public int delInformation(String ids){
        List<String> idlist = Arrays.asList(ids.split(","));
        return informationService.deleteByPrimaryKey(idlist);
    }

    /**
     * 资讯增加/修改（接口）
     * @param tInformation
     * @return
     */
    @RequestMapping(value = "/addInformation")
    @ResponseBody
    public int addInformation(TInformation tInformation) throws UnsupportedEncodingException {
        int i = 0;
        if (StringUtil.isEmpty(tInformation.gettId())) {
            String tContent = tInformation.gettContent();
            //判断是否存在表情
            boolean b = EmojiFilter.containsEmoji(tContent);
            if(b){
                byte[] textByte = tContent.getBytes("UTF-8");
                //编码
                String encodedText = encoder.encodeToString(textByte);

                tInformation.settContent(encodedText);
            }
            i = informationService.insertInformation(tInformation);
        } else {
            i = informationService.updateInformation(tInformation);
        }
        return i;
    }

    /**
     * 前端获取资讯列表数据（接口）
     * @param tInformation
     * @return
     */
    @RequestMapping(value = "/getInformationList")
    @ResponseBody
    public Map<String,Object> getInformationList(TInformation tInformation, int rows) {
        Map<String,Object> maps = new HashMap<>();
        List<TInformation> tInformationList = new ArrayList<>();
        try {
            PageHelper.startPage(tInformation.getPage(),rows);//分页查询
            List<TInformation> tInformations = informationService.selectByExample(tInformation);
            for (TInformation information : tInformations) {
                information.settCreateTime(information.gettCreateTime().substring(5,16));
                if(StringUtil.isNotEmpty(information.gettImg())){
                    List<String> listImg = Arrays.asList(information.gettImg().split(","));
                    information.setListImg(listImg);
                }

                // 微信名称
                String nickname = information.getpId();
                if(StringUtils.isNotBlank(nickname)){
                    // 判断微信名称是否Base64编码
                    Boolean isLegal = nickname.matches(base64Pattern);
                    if (isLegal) {
                        //解码
                        String nicknameData = new String(decoder.decode(nickname), "UTF-8");
                        information.setpId(nicknameData);
                    }
                }
                // 发布内容
                String tContent = information.gettContent();
                // 判断发布内容是否Base64编码
                Boolean isLegal = tContent.matches(base64Pattern);
                if (isLegal) {
                    //解码
                    String tContentData = new String(decoder.decode(tContent), "UTF-8");
                    information.settContent(tContentData);
                }
                tInformationList.add(information);
            }
            PageInfo<TInformation> pageInfo = new PageInfo<>(tInformations);
            maps.put("tInformation", tInformationList);
            maps.put("pages", pageInfo.getPages());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return maps;
    }

    /**
     * 前端获取个人资讯列表数据（接口）
     * @param tInformation
     * @return
     */
    @RequestMapping(value = "/getInformationListByUser")
    @ResponseBody
    public Map<String,Object> getInformationListByUser(TInformation tInformation, int rows) {
        Map<String,Object> maps = new HashMap<>();
        List<TInformation> tInformationList = new ArrayList<>();
        try {
            PageHelper.startPage(tInformation.getPage(),rows);//分页查询
            List<TInformation> tInformations = informationService.getInformationListByUser(tInformation);
            for (TInformation information : tInformations) {
                information.settCreateTime(information.gettCreateTime().substring(5,16));
                if(StringUtil.isNotEmpty(information.gettImg())){
                    List<String> listImg = Arrays.asList(information.gettImg().split(","));
                    information.setListImg(listImg);
                }
                // 微信名称
                String nickname = information.getpId();
                if(StringUtils.isNotBlank(nickname)){
                    // 判断微信名称是否Base64编码
                    Boolean isLegal = nickname.matches(base64Pattern);
                    if (isLegal) {
                        //解码
                        String nicknameData = new String(decoder.decode(nickname), "UTF-8");
                        information.setpId(nicknameData);
                    }
                }
                // 发布内容
                String tContent = information.gettContent();
                // 判断时候Base64编码
                Boolean isLegal = tContent.matches(base64Pattern);
                if (isLegal) {
                    //解码
                    String tContentData = new String(decoder.decode(tContent), "UTF-8");
                    information.settContent(tContentData);
                }
                tInformationList.add(information);
            }
            PageInfo<TInformation> pageInfo = new PageInfo<>(tInformations);
            maps.put("tInformation", tInformationList);
            maps.put("pages", pageInfo.getPages());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return maps;
    }

    /**
     * 前端查询咨询详情（接口）
     * @param tInformation
     * @return
     */
    @RequestMapping("/getInformationByTid")
    @ResponseBody
    public TInformation getInformationByTid(TInformation tInformation) throws UnsupportedEncodingException {
        TInformation informationByTid = informationService.getInformationByTid(tInformation);
        if(StringUtil.isNotEmpty(informationByTid.gettImg())){
            List<String> listImg = Arrays.asList(informationByTid.gettImg().split(","));
            informationByTid.setListImg(listImg);
        }
        informationByTid.settCreateTime(informationByTid.gettCreateTime().substring(5,16));
        // 微信名称
        String nickname = informationByTid.getpId();
        if(StringUtils.isNotBlank(nickname)){
            // 判断微信名称是否Base64编码
            Boolean isLegal = nickname.matches(base64Pattern);
            if (isLegal) {
                //解码
                String nicknameData = new String(decoder.decode(nickname), "UTF-8");
                informationByTid.setpId(nicknameData);
            }
        }
        // 发布内容
        String tContent = informationByTid.gettContent();
        // 判断是否Base64编码
        Boolean isLegal = tContent.matches(base64Pattern);
        if (isLegal) {
            //解码
            String tContentData = new String(decoder.decode(tContent), "UTF-8");
            informationByTid.settContent(tContentData);
        }
        return informationByTid;
    }

    /**
     * 资讯前端删除（接口）
     * @param tInformation
     * @return
     */
    @RequestMapping(value = "/removeInformation")
    @ResponseBody
    public int removeInformation(TInformation tInformation){
        return informationService.removeInformation(tInformation);
    }


}
