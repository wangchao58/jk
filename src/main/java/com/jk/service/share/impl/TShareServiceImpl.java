package com.jk.service.share.impl;

import com.jk.entity.reception.TShare;
import com.jk.mapper.reception.TShareMapper;
import com.jk.service.share.TShareService;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TShareServiceImpl implements TShareService {

    @Autowired
    TShareMapper tShareMapper;


    @Override
    public int deleteByPrimaryKey(String ids) {
        List<String> listIds = Arrays.asList(ids.split(","));
        int i = tShareMapper.deleteByPrimaryKey(listIds);
        return i;
    }

    @Override
    public int insertSelective(TShare record) {
        record.settId(UUIDUtil.getUUID());
        int i = tShareMapper.insertSelective(record);
        return i;
    }

    @Override
    public List<TShare> selectByExample(TShare example) {
        List<TShare> tShareList = tShareMapper.selectByExample(example);
        return tShareList;
    }

    @Override
    public TShare selectByPrimaryKey(String tId) {
        TShare share = tShareMapper.selectByPrimaryKey(tId);
        return share;
    }

    @Override
    public int updateByPrimaryKeySelective(TShare record) {
        int i = tShareMapper.updateByPrimaryKeySelective(record);
        return i;
    }
}
