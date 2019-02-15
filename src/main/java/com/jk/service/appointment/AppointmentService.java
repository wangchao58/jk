package com.jk.service.appointment;

import com.jk.entity.reception.TAppointment;
import com.jk.entity.reception.TAppointmentExample;

import java.util.List;

public interface AppointmentService {
    int deleteByPrimaryKey(String tId);

    int insert(TAppointment record);

    int insertSelective(TAppointment record);

    List<TAppointment> selectByExample(TAppointment example);

    TAppointment selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TAppointment record);

    int updateByPrimaryKey(TAppointment record);
}
