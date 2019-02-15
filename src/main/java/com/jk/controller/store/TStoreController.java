package com.jk.controller.store;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TStore;
import com.jk.service.store.TStoreService;
import com.jk.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * 进入店铺管理列表页面
     * @return
     */
    @RequestMapping(value = "/listStoreView")
    public String listMenuView(Model model, String pid, String id) {
        model.addAttribute("pid",pid);
        model.addAttribute("id",id);
        return "html/reception/store/storeList";
    }


    /**
     * 删除店铺管理发布的信息
     * @param ids
     * @return
     */
    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(String ids) {
        int i = tStoreService.deleteByPrimaryKey(ids);
        return i;
    }

    /**
     * 增加店铺管理发布的信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(TStore record,String [] region) {
        record.setProvince(region[0]);
        record.setCity(region[1]);
        record.setDistrict(region[2]);
        int i = tStoreService.insertSelective(record);
        return i;
    }

    /**
     * 功能：店铺列表
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

    /**
     * 功能：接口店铺列表
     * 作者：transcend
     * @param record
     * @param rows
     * @return
     */
    @RequestMapping(value = "/selectByExampleByPort")
    @ResponseBody
    public Map<String,Object> selectByExampleByPort(TStore record, int rows) {
        Map<String,Object> maps = new HashMap<>();
        PageHelper.startPage(record.getPage(),rows);//分页查询
        List<TStore> tStoreList =  tStoreService.selectByExample(record);
        PageInfo<TStore> pageInfo = new PageInfo<>(tStoreList);
        maps.put("tStoreList",tStoreList);
        maps.put("pages",pageInfo.getPages());
        return maps;
    }

    /**
     * 功能：查询一条
     * 作者：transcend
     * @param tId
     * @return
     */
    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public TStore selectByPimaryKey(String tId) {
        TStore tStore = tStoreService.selectByPrimaryKey(tId);
        return tStore;
    }

    /**
     * 功能：修改
     * 作者：transcend
     * @param record
     * @return
     */
    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(TStore record) {
        int i = tStoreService.updateByPrimaryKeySelective(record);
        return i;
    }
}
