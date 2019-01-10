package com.jk.service.carOwner.impl;

import com.jk.entity.reception.TCarOwner;
import com.jk.mapper.reception.TCarOwnerMapper;
import com.jk.service.carOwner.TCarOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TCarOwnerServiceImpl implements TCarOwnerService {

    @Autowired
    TCarOwnerMapper tCarOwnerMapper;

    @Override
    public int deleteByPrimaryKey(String ids) {
        List<String> idslist = Arrays.asList(ids.split(","));
        int i = tCarOwnerMapper.deleteByPrimaryKey(idslist);
        return i;
    }

    @Override
    public int insertSelective(TCarOwner record) {
        int i = tCarOwnerMapper.insertSelective(record);
        return i;
    }

    @Override
    public List<TCarOwner> selectByExample(TCarOwner example) {
        List<TCarOwner> tCarOwnerList = tCarOwnerMapper.selectByExample(example);
        return tCarOwnerList;
    }

    @Override
    public TCarOwner selectByPrimaryKey(String tId) {
        TCarOwner tCarOwner = tCarOwnerMapper.selectByPrimaryKey(tId);
        return tCarOwner;
    }

    @Override
    public int updateByPrimaryKeySelective(TCarOwner record) {
        int i = tCarOwnerMapper.updateByPrimaryKeySelective(record);
        return i;
    }
}
