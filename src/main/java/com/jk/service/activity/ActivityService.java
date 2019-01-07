package com.jk.service.activity;

import com.jk.entity.reception.TActivity;

import java.util.List;

public interface ActivityService {

    List<TActivity> selectByExample(TActivity tActivity);

    int insertActivity(TActivity tActivity);

    int updateActivity(TActivity tActivity);

    TActivity selectByPrimaryKey(String id);

    int deleteByPrimaryKey(List<String> idlist);
}
