package com.jk.mapper.reception;

import com.jk.entity.reception.TCarGroup;
import com.jk.entity.reception.TCarGroupExample;
import java.util.List;

public interface TCarGroupMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TCarGroup record);

    int insertSelective(TCarGroup record);

    List<TCarGroup> selectByExample(TCarGroup example);

    TCarGroup selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TCarGroup record);

    int updateByPrimaryKey(TCarGroup record);
}