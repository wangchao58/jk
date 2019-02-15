package com.jk.service.complain.impl;

import com.jk.entity.reception.TComplain;
import com.jk.mapper.reception.TComplainMapper;
import com.jk.service.complain.ComplainService;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplainServiceImpl implements ComplainService {

    @Autowired
    TComplainMapper tComplainMapper;


    @Override
    public int insertSelective(TComplain record) {
        record.settId(UUIDUtil.getUUID());
        int i = tComplainMapper.insertSelective(record);
        return i;
    }
}
