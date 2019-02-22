package com.jk.service.store;

import com.jk.entity.reception.TStore;

import java.util.List;

public interface TStoreService {
    int deleteByPrimaryKey(String ids);

    int insertSelective(TStore record);

    List<TStore> selectByExample(TStore example);

    TStore selectByPrimaryKey(String tId, String enshrineViews);

    int updateByPrimaryKeySelective(TStore record);

}
