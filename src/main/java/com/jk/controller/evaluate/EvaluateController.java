package com.jk.controller.evaluate;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TEvaluate;
import com.jk.service.evaluate.EvaluateServicr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/evaluate")
public class EvaluateController {

    @Autowired
    EvaluateServicr evaluateServicr;

    /**
     * 资讯评论（接口）
     * @param tEvaluate
     * @return
     */
    @RequestMapping("/addEvaluate")
    @ResponseBody
    public int addEvaluate(TEvaluate tEvaluate){
        return evaluateServicr.addEvaluate(tEvaluate);
    }

    /**
     * 查询资讯评论信息（接口）
     * @param tEvaluate
     * @return
     */
    @RequestMapping("/selTEvaluateList")
    @ResponseBody
    public List<TEvaluate> selTEvaluateList(TEvaluate tEvaluate){
        return evaluateServicr.selTEvaluateList(tEvaluate);
    }

    /**
     * 查询我的评论资讯评论信息（接口）
     * @param tEvaluate
     * @return
     */
    @RequestMapping("/selTEvaluateListByPort")
    @ResponseBody
    public Map<String,Object> selTEvaluateListByPort(TEvaluate tEvaluate, int rows){
        Map<String,Object> maps = new HashMap<>();
        PageHelper.startPage(tEvaluate.getPage(),rows);//分页查询
        List<Map<String,Object>> listEvaluate = evaluateServicr.selTEvaluateListByPort(tEvaluate);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(listEvaluate);
        maps.put("listEvaluate", listEvaluate);
        maps.put("pages", pageInfo.getPages());
        return maps;
    }


}
