package com.jk.controller.reception;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TPersonage;
import com.jk.service.reception.TPersonageService;
import com.jk.util.BaseController;
import com.jk.util.DateUtil;
import com.jk.util.HttpUtil;
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
 * 关注用户管理
 */
@Controller
@RequestMapping(value = "/personage")
public class TPersonageController extends BaseController {
    private final Base64.Decoder decoder = Base64.getDecoder();
    private final String base64Pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
    @Autowired
    TPersonageService tPersonageService;

    /**
     * 进入关注用户列表页面
     * @return
     */
    @RequestMapping(value = "/listPersonageView")
    public String listPersonageView(Model model, String pid, String id) {
        model.addAttribute("pid",pid);
        model.addAttribute("id",id);
        return "html/reception/personagelist";
    }

    /**
     * 关注用户列表
     *
     * @return
     */
    @RequestMapping(value = "/listPersonage")
    @ResponseBody
    public String listPersonage(TPersonage personage, int rows) {
        List<TPersonage> tPersonageDataList = new ArrayList<>();
        try {
            PageHelper.startPage(personage.getPage(),rows);//分页查询
            List<TPersonage> tTPersonageList = tPersonageService.selectByExample(personage);
            for (TPersonage tPersonage : tTPersonageList) {
                String nickName = tPersonage.getNickname();
                if(StringUtils.isNotBlank(nickName)){
                    // 判断时候Base64编码
                    Boolean isLegal = nickName.matches(base64Pattern);
                    if (isLegal) {
                        //解码
                        String nickNamenData = new String(decoder.decode(nickName), "UTF-8");
                        tPersonage.setNickname(nickNamenData);
                    }
                }
                tPersonageDataList.add(tPersonage);
            }
            PageInfo<TPersonage> pageInfo = new PageInfo<>(tTPersonageList);
            personage.setPageSize(rows);
            personage.setRows(tPersonageDataList);
            personage.setPage(personage.getPage());
            personage.setTotal(pageInfo.getPages());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return JsonUtil.toJsonString(personage);
    }

    /**
     * 增加关注用户
     * @return
     */
    @RequestMapping(value = "/addPersonage")
    @ResponseBody
    public Map<String,Object> addPersonage(TPersonage personage,String code) {
        String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss");
        Map<String,Object> m = HttpUtil.sendGet(code);
        String session_key = m.get("session_key").toString();
        personage.setOpenid(m.get("openid").toString());

        personage.settCreateTime(dateNow);
        int i = 0;
        Map<String,Object> map = new HashMap<>();
        if(m.get("errcode") != null) {
            map.put("id",null);
            return map;
        }
        String id  = tPersonageService.insertSelective(personage);
        map.put("id",id);
        map.put("session_key",session_key);
        return map;
    }

    /**
     * 修改关注用户可以登录后台
     * @return
     */
    @RequestMapping(value = "/updPersonage")
    @ResponseBody
    public int updPersonage(TPersonage personage) {
        int i = 0;
        /*if(personage.getIsLogin().equals("1")) {
            personage.setIsLogin("0");
        } else {
            personage.setIsLogin("1");
        }*/
        i = tPersonageService.updateByPrimaryKeySelective(personage);
        return i;
    }

    /**
     * 查询单个用户
     * @return
     */
    @RequestMapping(value = "/seleByKeyPort")
    @ResponseBody
    public TPersonage seleByKeyPort(String id) {

        TPersonage personage = tPersonageService.selectByPrimaryKeyUser(id);
        return personage;
    }


}
