package com.jk.mapper.reception;

import com.jk.entity.reception.TStore;
import com.jk.entity.reception.TStoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TStoreMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TStore record);

    int insertNiewsNum(String id);

    int insertCollectionNum(@Param("id") String id,@Param("addO") String addO);

    int insertSelective(TStore record);

    List<TStore> selectByExample(TStore example);

    TStore selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TStore record);

    int updateByPrimaryKey(TStore record);

    TStore getTStore(String tId);
}