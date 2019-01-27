package com.jk.service.carGroup.impl;

import com.jk.entity.reception.TCarGroup;
import com.jk.mapper.reception.TCarGroupMapper;
import com.jk.service.carGroup.TCarGroupService;
import com.jk.util.DateUtil;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class TCarGroupServiceImpl implements TCarGroupService {


    @Autowired
    TCarGroupMapper tCarGroupMapper;

    @Override
    public int deleteByPrimaryKey(String ids) {
        List<String> idsList = Arrays.asList(ids.split(","));
        int i = tCarGroupMapper.deleteByPrimaryKey(idsList);
        return i;
    }

    @Override
    public int insertSelective(TCarGroup record) {
        record.settId(UUIDUtil.getUUID());
        record.settCreateTime(DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
        int i = tCarGroupMapper.insertSelective(record);
        return i;
    }

    @Override
    public List<TCarGroup> selectByExample(TCarGroup example) {
        List<TCarGroup> tCarGroupList= tCarGroupMapper.selectByExample(example);
        return tCarGroupList;
    }

    @Override
    public List<TCarGroup> selectByExampleByPort(TCarGroup example) {
        List<TCarGroup> tCarGroupList= tCarGroupMapper.selectByExampleByPort(example);
        return tCarGroupList;
    }

    @Override
    public TCarGroup selectByPrimaryKey(String tId) {
        tCarGroupMapper.insertNiewsNum(tId);
        TCarGroup tCarGroup= tCarGroupMapper.selectByPrimaryKey(tId);
        return tCarGroup;
    }

    @Override
    public int updateByPrimaryKeySelective(TCarGroup record) {
        int i = tCarGroupMapper.updateByPrimaryKeySelective(record);
        return i;
    }
}
