package com.jk.mapper.reception;

import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TActivityExample;
import com.jk.entity.reception.TApply;

import java.util.List;
import java.util.Map;

public interface TActivityMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TActivity record);

    int insertSelective(TActivity record);

    List<TActivity> selectByExample(TActivity tActivity);

    List<Map<String, Object>> activityApplyByPortList(TApply tActivity);

    TActivity selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TActivity record);

    int updateByPrimaryKey(TActivity record);

    TActivity getActivityByTid(TActivity tActivity);

    TActivity selActivityByPrimaryKey(TActivity tActivity);

    int removeInformation(TActivity tActivity);
}