package com.jk.service.complain.impl;

import com.jk.entity.reception.TComplain;
import com.jk.mapper.reception.TComplainMapper;
import com.jk.service.complain.ComplainService;
import com.jk.util.DateUtil;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ComplainServiceImpl implements ComplainService {

    @Autowired
    TComplainMapper tComplainMapper;


    @Override
    public int insertSelective(TComplain record) {
        String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss");
        record.settId(UUIDUtil.getUUID());
        record.setCreateTime(dateNow);
        int i = tComplainMapper.insertSelective(record);
        return i;
    }

    /**
     * 投诉建议查询列表
     * @param tComplain
     * @return
     */
    @Override
    public List<TComplain> selectByExample(TComplain tComplain) {
        return tComplainMapper.selectByExample(tComplain);
    }
}
