package com.jk.mapper.reception;

import com.jk.entity.reception.TInformation;

import java.util.List;

public interface TInformationMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TInformation record);

    int insertSelective(TInformation record);

    List<TInformation> selectInformation(TInformation tInformation);

    List<TInformation> selectByExample(TInformation tInformation);

    TInformation selectByPrimaryKey(String tId);

    TInformation selectByPrimaryKeyByprore(String tId);

    int updateByPrimaryKeySelective(TInformation record);

    int updateByPrimaryKey(TInformation record);

    TInformation getInformationByTid(TInformation tInformation);

    int removeByPrimaryKey(TInformation tInformation);

    List<TInformation> getInformationListByUser(TInformation tInformation);
}