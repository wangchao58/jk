package com.jk.controller.car.carPassenger;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TCarPassenger;
import com.jk.service.carPassenger.TCarPassengerService;
import com.jk.util.BaseController;
import com.jk.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 拼车乘客管理
 */
@Controller
@RequestMapping(value = "/carPassenger")
public class TCarPassengerController extends BaseController {

    @Autowired
    TCarPassengerService tCarPassengerService;


    /**
     * 进入乘客列表页面
     * @return
     */
    @RequestMapping(value = "/listCarPassengerView")
    public String listMenuView(Model model, String pid, String id) {
        model.addAttribute("pid",pid);
        model.addAttribute("id",id);
        return "html/reception/carPassenger/listCarPassenger";
    }


    /**
     * 删除乘客发布的信息
     * @param ids
     * @return
     */
    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(String ids) {
        int i = tCarPassengerService.deleteByPrimaryKey(ids);
        return i;
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(TCarPassenger record) {
        int i = tCarPassengerService.insertSelective(record);
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
    public String selectByExample(TCarPassenger record, int rows) {
        PageHelper.startPage(record.getPage(),rows);//分页查询
        List<TCarPassenger> tCarPassengerList =  tCarPassengerService.selectByExample(record);
        PageInfo<TCarPassenger> pageInfo = new PageInfo<>(tCarPassengerList);
        record.setPageSize(rows);
        record.setRows(tCarPassengerList);
        record.setPage(record.getPage());
        record.setTotal(pageInfo.getPages());
        return JsonUtil.toJsonString(record);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public TCarPassenger selectByPrimaryKey(String tId) {
        TCarPassenger tCarPassenger = tCarPassengerService.selectByPrimaryKey(tId);
        return tCarPassenger;
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(TCarPassenger record) {
        int i = tCarPassengerService.updateByPrimaryKeySelective(record);
        return i;
    }
}
