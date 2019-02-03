package com.jk.service.appointment.impl;

import com.jk.entity.reception.TAppointment;
import com.jk.entity.reception.TAppointmentExample;
import com.jk.mapper.reception.TAppointmentMapper;
import com.jk.service.appointment.AppointmentService;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    TAppointmentMapper tAppointmentMapper;


    @Override
    public int deleteByPrimaryKey(String tId) {
        return 0;
    }

    @Override
    public int insert(TAppointment record) {
        record.settId(UUIDUtil.getUUID());
        int i = tAppointmentMapper.insert(record);
        return i;
    }

    @Override
    public int insertSelective(TAppointment record) {
        record.settId(UUIDUtil.getUUID());
        int i = tAppointmentMapper.insert(record);
        return i;
    }

    @Override
    public List<TAppointment> selectByExample(TAppointment example) {
        return null;
    }

    @Override
    public TAppointment selectByPrimaryKey(String tId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TAppointment record) {
        return tAppointmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TAppointment record) {
        return 0;
    }
}
