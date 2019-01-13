package com.jk.service.enshrine.impl;

import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TEnshrine;
import com.jk.mapper.reception.TActivityMapper;
import com.jk.mapper.reception.TEnshrineMapper;
import com.jk.service.enshrine.EnshrineService;
import com.jk.util.DateUtil;
import com.jk.util.UUIDUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EnshrineServiceImpl implements EnshrineService {
    private String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss");

    @Autowired
    TEnshrineMapper tEnshrineMapper;
    @Autowired
    TActivityMapper tActivityMapper;// 活动

    /**
     * 收藏添加（接口）
     * @param tEnshrine
     * @return
     */
    @Override
    public int addEnshrine(TEnshrine tEnshrine) {
        int i = 0;
        String tType = tEnshrine.gettType();
        // 收藏类型，0：拼车，1：店铺；2：活动；3：资讯
        if(StringUtils.equals("0",tType)){

        }else if(StringUtils.equals("1",tType)){

        }else if(StringUtils.equals("2",tType)){
            i = activityEnshrine(tEnshrine);
        }else if(StringUtils.equals("3",tType)){

        }
        return i;
    }

    /**
     * 收藏数据查询（接口）
     * @param tEnshrine
     * @return
     */
    @Override
    public List<TEnshrine> selEnshrineList(TEnshrine tEnshrine) {
        return tEnshrineMapper.selectByExample(tEnshrine);
    }

    /**
     * 活动收藏
     * @param tEnshrine
     * @return
     */
    public int activityEnshrine(TEnshrine tEnshrine){
        int i = 0;
        TActivity tActivity = new TActivity();
        tActivity.settId(tEnshrine.gethId());
        // 根据活动id查询活动信息
        TActivity activityByTid = tActivityMapper.getActivityByTid(tActivity);

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
            tEnshrine.settTime(dateNow);
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
