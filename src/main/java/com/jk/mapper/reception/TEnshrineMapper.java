package com.jk.mapper.reception;

import com.jk.entity.reception.TEnshrine;
import com.jk.entity.reception.TEnshrineExample;

import java.util.List;

public interface TEnshrineMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TEnshrine record);

    int insertSelective(TEnshrine record);

    List<TEnshrine> selectByExample(TEnshrine tEnshrine);

    TEnshrine selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TEnshrine record);

    int updateByPrimaryKey(TEnshrine record);

    TEnshrine selEnshrine(TEnshrine tEnshrine);
}