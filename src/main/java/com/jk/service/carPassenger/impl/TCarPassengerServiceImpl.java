package com.jk.service.carPassenger.impl;

import com.jk.entity.reception.TCarPassenger;
import com.jk.mapper.reception.TCarPassengerMapper;
import com.jk.service.carPassenger.TCarPassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TCarPassengerServiceImpl implements TCarPassengerService {

    @Autowired
    TCarPassengerMapper TCarPassengerMapper;

    @Override
    public int deleteByPrimaryKey(String tId) {
        List<String> ids = Arrays.asList(tId.split(","));
        int i = TCarPassengerMapper.deleteByPrimaryKey(ids);
        return i;
    }

    @Override
    public int insertSelective(TCarPassenger record) {
        int i = TCarPassengerMapper.insertSelective(record);
        return i;
    }

    @Override
    public List<TCarPassenger> selectByExample(TCarPassenger record) {
        List<TCarPassenger> tCarPassengerList =  TCarPassengerMapper.selectByExample(record);
        return tCarPassengerList;
    }

    @Override
    public TCarPassenger selectByPrimaryKey(String tId) {
        TCarPassenger tCarPassenger = TCarPassengerMapper.selectByPrimaryKey(tId);
        return tCarPassenger;
    }

    @Override
    public int updateByPrimaryKeySelective(TCarPassenger record) {
        int i = TCarPassengerMapper.updateByPrimaryKeySelective(record);
        return i;
    }
}
