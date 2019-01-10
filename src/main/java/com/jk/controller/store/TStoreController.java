package com.jk.controller.store;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TCarOwner;
import com.jk.entity.reception.TStore;
import com.jk.service.store.TStoreService;
import com.jk.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 店铺管理
 * 王超
 */
@Controller
@RequestMapping(value = "/store")
public class TStoreController  {

    @Autowired
    TStoreService tStoreService;


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
        int i = tStoreService.deleteByPrimaryKey(tId);
        return i;
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(TStore record) {
        int i = tStoreService.insertSelective(record);
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
    public String selectByExample(TStore record, int rows) {
        PageHelper.startPage(record.getPage(),rows);//分页查询
        List<TStore> tStoreList =  tStoreService.selectByExample(record);
        PageInfo<TStore> pageInfo = new PageInfo<>(tStoreList);
        record.setPageSize(rows);
        record.setRows(tStoreList);
        record.setPage(record.getPage());
        record.setTotal(pageInfo.getPages());
        return JsonUtil.toJsonString(record);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public TStore selectByPimaryKey(String tId) {
        TStore tStore = tStoreService.selectByPrimaryKey(tId);
        return tStore;
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(TStore record) {
        int i = tStoreService.updateByPrimaryKeySelective(record);
        return i;
    }
}
