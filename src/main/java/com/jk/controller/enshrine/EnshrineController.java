package com.jk.controller.enshrine;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TCarOwner;
import com.jk.entity.reception.TEnshrine;
import com.jk.service.enshrine.EnshrineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/enshrine")
public class EnshrineController {
    @Autowired
    EnshrineService enshrineService;

    /**
     * 收藏添加（接口）
     * @param tEnshrine
     * @return
     */
    @RequestMapping(value = "/addEnshrine")
    @ResponseBody
    public int addEnshrine(TEnshrine tEnshrine){
        return enshrineService.addEnshrine(tEnshrine);
    }

    /**
     * 收藏数据查询（接口）
     * @param tEnshrine
     * @return
     */
    @RequestMapping(value = "/selEnshrineList")
    @ResponseBody
    public List<TEnshrine> selEnshrineList(TEnshrine tEnshrine){
        return enshrineService.selEnshrineList(tEnshrine);
    }
    /**
     * 收藏数据商铺与活动查询（接口）
     * @param tEnshrine
     * @return
     */
    @RequestMapping(value = "/selEnshrineListByport")
    @ResponseBody
    public Map<String,Object> selEnshrineListByport(TEnshrine tEnshrine,int rows){
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(tEnshrine.getPage(),rows);//分页查询
        List<Map<String,Object>> listENshrice = enshrineService.selEnshrineListByport(tEnshrine);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(listENshrice);
        map.put("listENshrice",listENshrice);
        map.put("pages",pageInfo.getPages());
        return map;
    }
}
