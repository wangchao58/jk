package com.jk.controller.information;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.jk.entity.reception.TEvaluate;
import com.jk.entity.reception.TInformation;
import com.jk.service.activity.ActivityService;
import com.jk.service.information.InformationService;
import com.jk.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * 资讯相关
 */
@Controller
@RequestMapping("/information")
public class InformationController {
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
     * 资讯列表数据查询
     * @param tInformation
     * @param rows
     * @return
     */
    @RequestMapping(value = "/listInformation")
    @ResponseBody
    public String listInformation(TInformation tInformation, int rows) {
        PageHelper.startPage(tInformation.getPage(), rows); //分页查询
        List<TInformation> tInformationList = informationService.selectByExample(tInformation);
        PageInfo<TInformation> pageInfo = new PageInfo<>(tInformationList);
        tInformation.setPageSize(rows);
        tInformation.setRows(tInformationList);
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
    public int addInformation(TInformation tInformation) {
        int i = 0;
        if (StringUtil.isEmpty(tInformation.gettId())) {
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
    public List<TInformation> getInformationList(TInformation tInformation) {
        List<TInformation> tInformationList = informationService.selectByExample(tInformation);
        return tInformationList;
    }

    /**
     * 前端查询咨询详情（接口）
     * @param request
     * @param tId
     * @return
     */
    @RequestMapping("/getInformationByTid")
    @ResponseBody
    public TInformation getInformationByTid(HttpServletRequest request, String tId){
        TInformation tInformation = new TInformation();
        tInformation.settId(tId);
        TInformation informationByTid = informationService.getInformationByTid(tInformation);
        return informationByTid;
    }

    /**
     * 资讯点赞（接口）
     * @param tInformation
     * @param index 1:点赞 0：取消赞
     * @return
     */
    @RequestMapping("/prais")
    @ResponseBody
    public int prais(TInformation tInformation, String index){
        return informationService.prais(tInformation, index);
    }

    /**
     * 资讯评论（接口）
     * @param tEvaluate
     * @return
     */
    @RequestMapping("/addEvaluate")
    @ResponseBody
    public int addEvaluate(TEvaluate tEvaluate){
        return informationService.addEvaluate(tEvaluate);
    }

    /**
     * 查询资讯评论信息（接口）
     * @param tEvaluate
     * @return
     */
    @RequestMapping("/selTEvaluateList")
    @ResponseBody
    public List<TEvaluate> selTEvaluateList(TEvaluate tEvaluate){
        return informationService.selTEvaluateList(tEvaluate);
    }
}
