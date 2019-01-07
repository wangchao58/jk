package com.jk.controller.information;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TInformation;
import com.jk.service.activity.ActivityService;
import com.jk.service.information.InformationService;
import com.jk.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
     * 删除卡券
     * @param ids
     * @return
     */
    @RequestMapping(value = "/delActivity")
    @ResponseBody
    public int delActivity(String ids){
        List<String> idlist = Arrays.asList(ids.split(","));
        return activityService.deleteByPrimaryKey(idlist);
    }
}
