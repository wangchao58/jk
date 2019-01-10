package com.jk.controller.car.carOwner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TCarOwner;
import com.jk.service.carOwner.TCarOwnerService;
import com.jk.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 拼车车主管理
 * 王超
 */
@RequestMapping(value = "/carOwner")
@Controller
public class TCarOwnerController {

    @Autowired
    TCarOwnerService tCarOwnerService;


    /**
     * 进入拼车车主列表页面
     * @return
     */
    @RequestMapping(value = "/listCarPassengerView")
    public String listMenuView(Model model, String pid, String id) {
        model.addAttribute("pid",pid);
        model.addAttribute("id",id);
        return "html/authority/CarPassenger/listCarPassenger";
    }


    /**
     * 删除拼车车主发布的信息
     * @param tId
     * @return
     */
    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(String tId) {
        int i = tCarOwnerService.deleteByPrimaryKey(tId);
        return i;
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(TCarOwner record) {
        int i = tCarOwnerService.insertSelective(record);
        return i;
    }

    /**
     * 功能：乘客列表
     * 作者：transcend
     * @param record
     * @param rows
     * @return
     */
    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public String selectByExample(TCarOwner record, int rows) {
        PageHelper.startPage(record.getPage(),rows);//分页查询
        List<TCarOwner> tCarOwnerList =  tCarOwnerService.selectByExample(record);
        PageInfo<TCarOwner> pageInfo = new PageInfo<>(tCarOwnerList);
        record.setPageSize(rows);
        record.setRows(tCarOwnerList);
        record.setPage(record.getPage());
        record.setTotal(pageInfo.getPages());
        return JsonUtil.toJsonString(record);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public TCarOwner selectByPimaryKey(String tId) {
        TCarOwner tCarOwner = tCarOwnerService.selectByPrimaryKey(tId);
        return tCarOwner;
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(TCarOwner record) {
        int i = tCarOwnerService.updateByPrimaryKeySelective(record);
        return i;
    }
}
