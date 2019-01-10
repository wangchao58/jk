package com.jk.service.carGroup.impl;

import com.jk.entity.reception.TCarGroup;
import com.jk.mapper.reception.TCarGroupMapper;
import com.jk.service.carGroup.TCarGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
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
        int i = tCarGroupMapper.insertSelective(record);
        return i;
    }

    @Override
    public List<TCarGroup> selectByExample(TCarGroup example) {
        List<TCarGroup> tCarGroupList= tCarGroupMapper.selectByExample(example);
        return tCarGroupList;
    }

    @Override
    public TCarGroup selectByPrimaryKey(String tId) {
        TCarGroup tCarGroup= tCarGroupMapper.selectByPrimaryKey(tId);
        return tCarGroup;
    }

    @Override
    public int updateByPrimaryKeySelective(TCarGroup record) {
        int i = tCarGroupMapper.updateByPrimaryKeySelective(record);
        return i;
    }
}
