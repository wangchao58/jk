package com.jk.controller.share;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TShare;
import com.jk.service.share.TShareService;
import com.jk.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 转发
 */
@Controller
@RequestMapping(value = "/share")
public class TShareController {

    @Autowired
    TShareService thareService;

    /**
     * 进入转发列表页面
     * @return
     */
    @RequestMapping(value = "/listCarPassengerView")
    public String listMenuView(Model model, String pid, String id) {
        model.addAttribute("pid",pid);
        model.addAttribute("id",id);
        return "html/authority/CarPassenger/listCarPassenger";
    }


    /**
     * 删除转发的信息
     * @param tId
     * @return
     */
    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(String tId) {
        int i = thareService.deleteByPrimaryKey(tId);
        return i;
    }

    /**
     * 增加转发记录
     * @param record
     * @return
     */
    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(TShare record) {
        int i = thareService.insertSelective(record);
        return i;
    }

    /**
     * 功能：转发列表
     * 作者：transcend
     * @param record
     * @param rows
     * @return
     */
    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public String selectByExample(TShare record, int rows) {
        PageHelper.startPage(record.getPage(),rows);//分页查询
        List<TShare> tShareList =  thareService.selectByExample(record);
        PageInfo<TShare> pageInfo = new PageInfo<>(tShareList);
        record.setPageSize(rows);
        record.setRows(tShareList);
        record.setPage(record.getPage());
        record.setTotal(pageInfo.getPages());
        return JsonUtil.toJsonString(record);
    }

    /**
     * 转发查询单条
     * @param tId
     * @return
     */
    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public TShare selectByPimaryKey(String tId) {
        TShare tShare = thareService.selectByPrimaryKey(tId);
        return tShare;
    }

    /**
     * 修改转发
     * @param record
     * @return
     */
    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(TShare record) {
        int i = thareService.updateByPrimaryKeySelective(record);
        return i;
    }

}
