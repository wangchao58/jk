package com.jk.service.reception.impl;

import com.github.pagehelper.StringUtil;
import com.jk.entity.reception.TPersonage;
import com.jk.mapper.reception.TPersonageMapper;
import com.jk.service.reception.TPersonageService;
import com.jk.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TPersonageServiceImpl implements TPersonageService {
    private String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss");

    @Autowired
    TPersonageMapper tPersonageMapper;

    @Override
    public String insertSelective(TPersonage record) {
        int i = 0;
        String id = "";
        TPersonage recordu =  tPersonageMapper.selectByPrimaryKey(record.getOpenid());
        if(recordu != null && StringUtil.isNotEmpty(recordu.gettId())) {
            recordu.setOpenid(record.getOpenid());
            recordu.settUpdateTime(dateNow);
            i = tPersonageMapper.updateByPrimaryKeySelective(recordu);
            id=recordu.gettId();
        } else {
            i = tPersonageMapper.insertSelective(record);
            id=record.gettId();
        }

        return id;
    }

    @Override
    public List<TPersonage> selectByExample(TPersonage record) {

        return tPersonageMapper.selectByExample(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TPersonage record) {
        return tPersonageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public TPersonage selectByPrimaryKeyUser(String id) {
        return tPersonageMapper.selectByPrimaryKey(id);
    }
}
