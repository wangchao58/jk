package com.jk.mapper.reception;

import com.jk.entity.reception.TEnshrine;
import com.jk.entity.reception.TEnshrineExample;

import java.util.List;
import java.util.Map;

public interface TEnshrineMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TEnshrine record);

    int insertSelective(TEnshrine record);

    List<TEnshrine> selectByExample(TEnshrine tEnshrine);

    List<Map<String,Object>> selEnshrineListByport(TEnshrine tEnshrine);

    TEnshrine selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TEnshrine record);

    int updateByPrimaryKey(TEnshrine record);

    TEnshrine selEnshrine(TEnshrine tEnshrine);

    TEnshrine selEnshrineBytype(TEnshrine tEnshrine);
}