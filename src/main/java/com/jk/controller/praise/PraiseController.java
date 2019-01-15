package com.jk.controller.praise;

import com.jk.entity.reception.TPraise;
import com.jk.service.praise.PraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
