package com.jk.controller.appointment;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TAppointment;
import com.jk.service.appointment.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 行程相关
 */
@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    /**
     * 前端获取行程列表信息（接口）
     * @param tAppointment
     * @return
     */
    @RequestMapping(value = "/getAppointmentList")
    @ResponseBody
    public Map<String,Object> getAppointmentList(TAppointment tAppointment, int rows) {
        Map<String,Object> maps = new HashMap<>();
        PageHelper.startPage(tAppointment.getPage(),rows);//分页查询
        List<TAppointment> tActivities = appointmentService.selectByExample(tAppointment);
        PageInfo<TAppointment> pageInfo = new PageInfo<>(tActivities);
        maps.put("activitytList", tAppointment);
        maps.put("pages", pageInfo.getPages());
        return maps;
    }

    /**
     * 行程增加/修改（接口）
     * @param tAppointment
     * @return
     */
    @RequestMapping(value = "/addAppointment")
    @ResponseBody
    public int addAppointment(TAppointment tAppointment) {
        int i = 0;
        if (StringUtil.isEmpty(tAppointment.gettId())) {
            i = appointmentService.insertSelective(tAppointment);
        } else {
            i = appointmentService.updateByPrimaryKeySelective(tAppointment);
        }
        return i;
    }
}
