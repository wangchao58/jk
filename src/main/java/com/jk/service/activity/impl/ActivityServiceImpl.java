package com.jk.service.activity.impl;

import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TApply;
import com.jk.entity.reception.TEnshrine;
import com.jk.mapper.reception.TActivityMapper;
import com.jk.mapper.reception.TApplyMapper;
import com.jk.mapper.reception.TEnshrineMapper;
import com.jk.service.activity.ActivityService;
import com.jk.util.DateUtil;
import com.jk.util.UUIDUtil;
import org.apache.commons.lang.StringUtils;
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
    @Autowired
    TApplyMapper tApplyMapper;// 报名

    /**
     * 活动列表数据查询
     * @param tActivity
     * @return
     */
    @Override
    public List<TActivity> selectByExample(TActivity tActivity) {
        if(StringUtils.equals("undefined",tActivity.gettHeadline())){
            tActivity.settHeadline("");
        }
        return tActivityMapper.selectByExample(tActivity);
    }

    /**
     * 增加活动
     * @param tActivity
     * @return
     */
    @Override
    public int insertActivity(TActivity tActivity) {
        String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss");
        tActivity.settId(UUIDUtil.getUUID());
        tActivity.settCreateTime(dateNow);
        tActivity.settPerNum(0);
        tActivity.settApplyNum(0);
        tActivity.settViewsNum(0);
        tActivity.settCollectionNum(0);
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
        // 获取活动详情信息
        TActivity activityByTid = tActivityMapper.getActivityByTid(tActivity);
        activityByTid.settStartTime(activityByTid.gettStartTime().substring(0,16));
        activityByTid.settEndTime(activityByTid.gettEndTime().substring(0,16));

        // 点击收藏时重新获取数据，不增加浏览量
        if(!StringUtils.equals("true", tActivity.getEnshrineViews())){
            // 增加此活动浏览次数
            TActivity activityData = new TActivity();
            activityData.settId(activityByTid.gettId());
            activityData.settViewsNum(activityByTid.gettViewsNum()+1);
            tActivityMapper.updateByPrimaryKeySelective(activityData);
        }
        return activityByTid;
    }

    /**
     * 活动收藏（接口）
     * @param tActivity
     * @return
     */
    /*@Override
    public int collectionActivity(TActivity tActivity) {
        int i = 0;
        // 根据活动id查询活动信息
        TActivity activityByTid = tActivityMapper.getActivityByTid(tActivity);

        TEnshrine tEnshrine = new TEnshrine();
        tEnshrine.sethId(activityByTid.gettId());
        tEnshrine.setpId(tActivity.getpId());
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
            tEnshrine.setpId(tActivity.getpId());
            tEnshrine.settTime(dateNow);
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
    }*/

    /**
     * 活动报名（接口）
     * @param tApply
     * @return
     */
    @Override
    public int activityApply(TApply tApply) {
        String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss");
        int i = 0;
        TActivity tActivity = new TActivity();
        tActivity.settId(tApply.gethId());
        TActivity activityByTid = tActivityMapper.getActivityByTid(tActivity);
        tApply.settId(UUIDUtil.getUUID());
        tApply.settTime(dateNow);
        i = tApplyMapper.insertSelective(tApply);
        if(i>0){
            // 报名人数增加
            tActivity.settApplyNum(activityByTid.gettApplyNum()+1);
            i = tActivityMapper.updateByPrimaryKeySelective(tActivity);
        }
        return i;
    }
}
