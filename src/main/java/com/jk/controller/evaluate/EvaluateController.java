package com.jk.controller.evaluate;

import com.jk.entity.reception.TEvaluate;
import com.jk.service.evaluate.EvaluateServicr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
}
