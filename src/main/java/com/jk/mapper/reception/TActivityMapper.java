package com.jk.mapper.reception;

import com.jk.entity.reception.TActivity;

import java.util.List;

public interface TActivityMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TActivity record);

    int insertSelective(TActivity record);

    List<TActivity> selectByExample(TActivity record);

    TActivity selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TActivity record);

    int updateByPrimaryKey(TActivity record);
}