package com.jk.mapper.reception;

import com.jk.entity.reception.TAppointment;
import com.jk.entity.reception.TAppointmentExample;
import java.util.List;

public interface TAppointmentMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TAppointment record);

    int insertSelective(TAppointment record);

    List<TAppointment> selectByExample(TAppointmentExample example);

    TAppointment selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TAppointment record);

    int updateByPrimaryKey(TAppointment record);
}