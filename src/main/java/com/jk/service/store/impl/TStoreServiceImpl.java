package com.jk.service.store.impl;

import com.jk.entity.reception.TStore;
import com.jk.mapper.reception.TStoreMapper;
import com.jk.service.store.TStoreService;
import com.jk.util.DateUtil;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.unit.DataUnit;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class TStoreServiceImpl implements TStoreService {

    @Autowired
    TStoreMapper tStoreMapper;

    @Override
    public int deleteByPrimaryKey(String ids) {
        List<String> stringList = Arrays.asList(ids.split(","));
        int i = tStoreMapper.deleteByPrimaryKey(stringList);
        return i;
    }

    @Override
    public int insertSelective(TStore record) {
        record.settId(UUIDUtil.getUUID());
        record.settCreateTime(DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
        int i = tStoreMapper.insertSelective(record);
        return i;
    }

    @Override
    public List<TStore> selectByExample(TStore example) {
        List<TStore> tStoreList = tStoreMapper.selectByExample(example);
        return tStoreList;
    }

    @Override
    public TStore selectByPrimaryKey(String tId) {
        tStoreMapper.insertNiewsNum(tId);
        TStore tStore = tStoreMapper.selectByPrimaryKey(tId);
        return tStore;
    }

    @Override
    public int updateByPrimaryKeySelective(TStore record) {
        int i = tStoreMapper.updateByPrimaryKeySelective(record);
        return i;
    }
}
