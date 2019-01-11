package com.jk.controller.enshrine;

import com.jk.entity.reception.TEnshrine;
import com.jk.service.enshrine.EnshrineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
}
