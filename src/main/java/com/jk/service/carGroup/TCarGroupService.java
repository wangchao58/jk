package com.jk.service.carGroup;

import com.jk.entity.reception.TCarGroup;

import java.util.List;

public interface TCarGroupService {

    int deleteByPrimaryKey(String ids);

    int insertSelective(TCarGroup record);

    List<TCarGroup> selectByExample(TCarGroup example);

    List<TCarGroup> selectByExampleByPort(TCarGroup example);

    TCarGroup selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TCarGroup record);
}
