package com.jk.mapper.reception;

import com.jk.entity.reception.TStore;
import com.jk.entity.reception.TStoreExample;
import java.util.List;

public interface TStoreMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TStore record);

    int insertNiewsNum(String id);

    int insertSelective(TStore record);

    List<TStore> selectByExample(TStore example);

    TStore selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TStore record);

    int updateByPrimaryKey(TStore record);
}