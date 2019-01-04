package com.jk.mapper.reception;

import com.jk.entity.reception.TStore;
import com.jk.entity.reception.TStoreExample;
import java.util.List;

public interface TStoreMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TStore record);

    int insertSelective(TStore record);

    List<TStore> selectByExample(TStoreExample example);

    TStore selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TStore record);

    int updateByPrimaryKey(TStore record);
}