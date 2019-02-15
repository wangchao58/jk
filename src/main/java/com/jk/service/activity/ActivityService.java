package com.jk.service.activity;

import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TApply;

import java.util.List;
import java.util.Map;

public interface ActivityService {

    List<TActivity> selectByExample(TActivity tActivity);

    int insertActivity(TActivity tActivity);

    int updateActivity(TActivity tActivity);

    TActivity selectByPrimaryKey(String id);

    int deleteByPrimaryKey(List<String> idlist);

    TActivity getActivityByTid(TActivity tActivity);

//    int collectionActivity(TActivity tActivity);

    int activityApply(TApply tApply);

    List<Map<String,Object>> activityApplyByPortList(TApply tActivity);
}
