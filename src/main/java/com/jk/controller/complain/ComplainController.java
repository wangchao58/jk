package com.jk.controller.complain;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TComplain;
import com.jk.service.complain.ComplainService;
import com.jk.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 投诉相关
 */
@Controller
@RequestMapping("/complain")
public class ComplainController {

    @Autowired
    ComplainService complainService;

    /**
     * 进入投诉建议列表页面(后台)
     * @param model
     * @param pid
     * @param id
     * @return
     */
    @RequestMapping(value = "/listActivityView")
    public String listActivityView(Model model, String pid, String id) {
        model.addAttribute("pid",pid);
        model.addAttribute("id",id);
        return "html/reception/complain/complainlist";
    }

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

    /**
     * 投诉建议查询列表（后台）
     * @param tComplain
     * @param rows
     * @return
     */
    @RequestMapping(value = "/listTComplain")
    @ResponseBody
    public String listTComplain(TComplain tComplain, int rows) {
        PageHelper.startPage(tComplain.getPage(), rows); //分页查询
        List<TComplain> tComplainLit = complainService.selectByExample(tComplain);
        PageInfo<TComplain> pageInfo = new PageInfo<>(tComplainLit);
        tComplain.setPageSize(rows);
        tComplain.setRows(tComplainLit);
        tComplain.setPage(tComplain.getPage());
        tComplain.setTotal(pageInfo.getPages());
        return JsonUtil.toJsonString(tComplain);
    }
}
