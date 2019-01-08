package com.jk.mapper.reception;

import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TActivityExample;
import java.util.List;

public interface TActivityMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TActivity record);

    int insertSelective(TActivity record);

    List<TActivity> selectByExample(TActivityExample example);

    TActivity selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TActivity record);

    int updateByPrimaryKey(TActivity record);
}