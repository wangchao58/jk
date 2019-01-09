package com.jk.service.activity.impl;

import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TEnshrine;
import com.jk.mapper.reception.TActivityMapper;
import com.jk.mapper.reception.TEnshrineMapper;
import com.jk.service.activity.ActivityService;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    TActivityMapper tActivityMapper;// 活动
    @Autowired
    TEnshrineMapper tEnshrineMapper;// 收藏

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

    /**
     * 活动收藏（接口）
     * @param tActivity
     * @return
     */
    @Override
    public int collectionActivity(TActivity tActivity) {
        int i = 0;
        // 根据活动id查询活动信息
        TActivity activityByTid = tActivityMapper.getActivityByTid(tActivity);

        TEnshrine tEnshrine = new TEnshrine();
        tEnshrine.sethId(activityByTid.gettId());
        tEnshrine.setpId(activityByTid.getpId());
        TEnshrine enshrine = tEnshrineMapper.selEnshrine(tEnshrine);
        // 判断此活动用户是否收藏
        if(null != enshrine){
            // 取消收藏
            i = tEnshrineMapper.deleteByPrimaryKey(enshrine.gettId());
            if(i>0){
                // 收藏活动，修改收藏次数
                TActivity activityData = new TActivity();
                activityData.settId(activityByTid.gettId());
                activityData.settCollectionNum(activityByTid.gettCollectionNum()-1);
                tActivityMapper.updateByPrimaryKeySelective(activityData);
            }
        }else{
            tEnshrine.settId(UUIDUtil.getUUID());
            tEnshrine.sethId(activityByTid.gettId());
            tEnshrine.setpId(activityByTid.getpId());
            tEnshrine.settTime(new Date());
            // 收藏类型，0：拼车，1：店铺；2：活动；3：资讯
            tEnshrine.settType("2");
            i = tEnshrineMapper.insertSelective(tEnshrine);
            if(i>0){
                // 收藏活动，修改收藏次数
                TActivity activityData = new TActivity();
                activityData.settId(activityByTid.gettId());
                activityData.settCollectionNum(activityByTid.gettCollectionNum()+1);
                tActivityMapper.updateByPrimaryKeySelective(activityData);
            }
        }
        return i;
    }
}
