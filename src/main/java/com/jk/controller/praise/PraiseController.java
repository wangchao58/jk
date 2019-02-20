package com.jk.controller.praise;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TPraise;
import com.jk.service.praise.PraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 点赞
 */
@Controller
@RequestMapping("/praise")
public class PraiseController {

    @Autowired
    PraiseService praiseService;

    /**
     * 资讯点赞（接口）
     * @param tPraise
     * @return
     */
    @RequestMapping("/addPraise")
    @ResponseBody
    public int addPraise(TPraise tPraise){
        return praiseService.addPraise(tPraise);
    }


    @RequestMapping("/listPraise")
    @ResponseBody
    public Map<String,Object>  listPraise(TPraise tPraise, int rows){
        Map<String,Object> maps = new HashMap<>();
        PageHelper.startPage(tPraise.getPage(),rows);//分页查询
        List<Map<String,Object>> tPraiseList = praiseService.listPraise(tPraise);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(tPraiseList);
        maps.put("tPraiseList", tPraiseList);
        maps.put("pages", pageInfo.getPages());
        return maps;
    }

    /**
     * 点赞总数
     * @param tPraise
     * @return
     */
    @RequestMapping("/totalPraise")
    @ResponseBody
    public Map<String,Object> totalPraise(TPraise tPraise){
        Map<String,Object> maps = new HashMap<>();
        List<Map<String,Object>> tPraiseList = praiseService.listPraise(tPraise);
        maps.put("tPraiseTotal", tPraiseList.size());
        return maps;
    }
}
