package com.jk.service.activity.impl;

import com.jk.entity.reception.TActivity;
import com.jk.mapper.reception.TActivityMapper;
import com.jk.service.activity.ActivityService;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    TActivityMapper tActivityMapper;

    /**
     * 活动列表数据查询
     * @param tActivity
     * @return
     */
    @Override
    public List<TActivity> selectByExample(TActivity tActivity) {
        return tActivityMapper.selectByExample(tActivity);
    }

    /**
     * 增加活动
     * @param tActivity
     * @return
     */
    @Override
    public int insertActivity(TActivity tActivity) {
        tActivity.settId(UUIDUtil.getUUID());
        tActivityMapper.insertSelective(tActivity);
        return tActivityMapper.insertSelective(tActivity);
    }

    /**
     * 修改活动
     * @param tActivity
     * @return
     */
    @Override
    public int updateActivity(TActivity tActivity) {
        return tActivityMapper.updateByPrimaryKeySelective(tActivity);
    }

    /**
     * 获取活动编辑信息
     * @param id
     * @return
     */
    @Override
    public TActivity selectByPrimaryKey(String id) {
        return tActivityMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除活动信息
     * @param idlist
     * @return
     */
    @Override
    public int deleteByPrimaryKey(List<String> idlist) {
        return tActivityMapper.deleteByPrimaryKey(idlist);
    }

    /**
     * 前端活动详情查看（接口）
     * @param tActivity
     * @return
     */
    @Override
    public TActivity getActivityByTid(TActivity tActivity) {
        return tActivityMapper.getActivityByTid(tActivity);
    }
}
