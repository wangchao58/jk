package com.jk.service.store.impl;

import com.github.pagehelper.StringUtil;
import com.jk.entity.reception.TStore;
import com.jk.mapper.reception.TStoreMapper;
import com.jk.service.store.TStoreService;
import com.jk.util.DateUtil;
import com.jk.util.Page;
import com.jk.util.UUIDUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        int i=0;
        if(StringUtil.isEmpty(record.gettId())) {
            record.settId(UUIDUtil.getUUID());
            record.settCreateTime(DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
            i = tStoreMapper.insertSelective(record);
        } else {
            i = tStoreMapper.updateByPrimaryKeySelective(record);
        }

        return i;
    }

    @Override
    public List<TStore> selectByExample(TStore example) {

        //String district = example.getDistrict();
        String city = example.getCity();
        String province = example.getProvince();
        example.setCity("");
        example.setProvince("");
        List<TStore> tStoreList = tStoreMapper.selectByExample(example);

        if(tStoreList.size()==0) {
            example.setDistrict("");
            example.setCity(city);
            tStoreList = tStoreMapper.selectByExample(example);
        }
        if(tStoreList.size()==0) {
            example.setDistrict("");
            example.setCity("");
            example.setProvince(province);
            tStoreList = tStoreMapper.selectByExample(example);
        }
        if(tStoreList.size()==0) {
            example.setDistrict("");
            example.setCity("");
            example.setProvince("");
            tStoreList = tStoreMapper.selectByExample(example);
        }
        return tStoreList;
    }

    @Override
    public TStore selectByPrimaryKey(String tId, String enshrineViews) {
        if(!StringUtils.equals("true", enshrineViews)){
            tStoreMapper.insertNiewsNum(tId);
        }
        TStore tStore = tStoreMapper.selectByPrimaryKey(tId);
        return tStore;
    }

    @Override
    public int updateByPrimaryKeySelective(TStore record) {
        int i = tStoreMapper.updateByPrimaryKeySelective(record);
        return i;
    }
}
