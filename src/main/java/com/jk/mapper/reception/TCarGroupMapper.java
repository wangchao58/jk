package com.jk.mapper.reception;

import com.jk.entity.reception.TCarGroup;
import com.jk.entity.reception.TCarGroupExample;
import java.util.List;

public interface TCarGroupMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TCarGroup record);

    int insertSelective(TCarGroup record);

    List<TCarGroup> selectByExample(TCarGroupExample example);

    TCarGroup selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TCarGroup record);

    int updateByPrimaryKey(TCarGroup record);
}