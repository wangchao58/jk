package com.jk.controller.car.carGroup;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TCarGroup;
import com.jk.entity.reception.TStore;
import com.jk.service.carGroup.TCarGroupService;
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
 * 拼车群
 */
@Controller
@RequestMapping(value = "carGroup")
public class TCarGroupController {

    @Autowired
    TCarGroupService tCarGroupService;


    /**
     * 进入拼车车主列表页面
     * @return
     */
    @RequestMapping(value = "/listCarGroupView")
    public String listMenuView(Model model, String pid, String id) {
        model.addAttribute("pid",pid);
        model.addAttribute("id",id);
        return "html/reception/carGroup/listCarGroup";
    }


    /**
     * 删除拼车车主发布的信息
     * @param tId
     * @return
     */
    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(String tId) {
        int i = tCarGroupService.deleteByPrimaryKey(tId);
        return i;
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(TCarGroup record) {
        int i = tCarGroupService.insertSelective(record);
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
    public String selectByExample(TCarGroup record, int rows) {
        PageHelper.startPage(record.getPage(),rows);//分页查询
        List<TCarGroup> tCarGroupList =  tCarGroupService.selectByExample(record);
        PageInfo<TCarGroup> pageInfo = new PageInfo<>(tCarGroupList);
        record.setPageSize(rows);
        record.setRows(tCarGroupList);
        record.setPage(record.getPage());
        record.setTotal(pageInfo.getPages());
        return JsonUtil.toJsonString(record);
    }


    /**
     * 功能：接口拼车群列表
     * 作者：transcend
     * @param record
     * @param rows
     * @return
     */
    @RequestMapping(value = "/selectByExampleByPort")
    @ResponseBody
    public Map<String,Object> selectByExampleByPort(TCarGroup record, int rows) {
        Map<String,Object> maps = new HashMap<>();
        PageHelper.startPage(record.getPage(),rows);//分页查询
        List<TCarGroup> tStoreList =  tCarGroupService.selectByExampleByPort(record);
        PageInfo<TCarGroup> pageInfo = new PageInfo<>(tStoreList);
        maps.put("carGroupList",tStoreList);
        maps.put("pages",pageInfo.getPages());
        return maps;
    }


    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public TCarGroup selectByPimaryKey(String tId) {
        TCarGroup tCarGroup = tCarGroupService.selectByPrimaryKey(tId);
        return tCarGroup;
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(TCarGroup record) {
        int i = tCarGroupService.updateByPrimaryKeySelective(record);
        return i;
    }

}
