package com.jk.controller.complain;

import com.github.pagehelper.StringUtil;
import com.jk.entity.reception.TAppointment;
import com.jk.entity.reception.TComplain;
import com.jk.service.complain.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 投诉相关
 */
@Controller
@RequestMapping("/complain")
public class ComplainController {

    @Autowired
    ComplainService complainService;


    /**
     * 行程增加/修改（接口）
     * @param tComplain
     * @return
     */
    @RequestMapping(value = "/addtComplain")
    @ResponseBody
    public int addtComplain(TComplain tComplain) {
        int i  = complainService.insertSelective(tComplain);
        return i;
    }
}
