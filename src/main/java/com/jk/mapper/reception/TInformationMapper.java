package com.jk.mapper.reception;

import com.jk.entity.reception.TInformation;

import java.util.List;

public interface TInformationMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TInformation record);

    int insertSelective(TInformation record);

    List<TInformation> selectByExample(TInformation tInformation);

    TInformation selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TInformation record);

    int updateByPrimaryKey(TInformation record);

    TInformation getInformationByTid(TInformation tInformation);
}