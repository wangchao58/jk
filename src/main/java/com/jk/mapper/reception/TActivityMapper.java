package com.jk.mapper.reception;

import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TActivityExample;
import java.util.List;

public interface TActivityMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TActivity record);

    int insertSelective(TActivity record);

    List<TActivity> selectByExample(TActivity tActivity);

    TActivity selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TActivity record);

    int updateByPrimaryKey(TActivity record);

    TActivity getActivityByTid(TActivity tActivity);
}