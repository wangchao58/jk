package com.jk.service.praise.impl;

import com.jk.entity.reception.TInformation;
import com.jk.entity.reception.TPraise;
import com.jk.mapper.reception.TInformationMapper;
import com.jk.mapper.reception.TPraiseMapper;
import com.jk.service.praise.PraiseService;
import com.jk.util.DateUtil;
import com.jk.util.UUIDUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PraiseServiceImpl implements PraiseService {
    private String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss");

    @Autowired
    TInformationMapper tInformationMapper;
    @Autowired
    TPraiseMapper tPraiseMapper;


    /**
     * 收藏添加（接口）
     * @param tPraise
     * @return
     */
    @Override
    public int addPraise(TPraise tPraise) {
        int i = 0;
        String tType = tPraise.gettType();
        // 收藏类型，0：拼车，1：店铺；2：活动；3：资讯
        if(StringUtils.equals("0",tType)){

        }else if(StringUtils.equals("1",tType)){

        }else if(StringUtils.equals("2",tType)){

        }else if(StringUtils.equals("3",tType)){
            i = infromationPraise(tPraise);
        }
        return i;
    }

    /**
     * 资讯点赞
     * @param tPraise
     * @return
     */
    public int infromationPraise(TPraise tPraise) {
        int i = 0;
        TInformation tInformation = new TInformation();
        tInformation.settId(tPraise.gethId());
        // 根据点赞数据id查询数据
        TInformation informationByTid = tInformationMapper.getInformationByTid(tInformation);

        TInformation tInformationData = new TInformation();
        tInformationData.settId(informationByTid.gettId());

        // 根据点赞数据id和用户id查询，用户是否已经点赞
        TPraise praise = tPraiseMapper.selectPraise(tPraise);
        if(null != praise){
            i = tPraiseMapper.deleteByPrimaryKey(praise.gettId());
            if(i > 0){
                tInformation.settPraise(informationByTid.gettPraise()-1);
            }
        }else{
            tPraise.settId(UUIDUtil.getUUID());
            tPraise.settTime(dateNow);
            i = tPraiseMapper.insertSelective(tPraise);
            if(i > 0){
                tInformation.settPraise(informationByTid.gettPraise()+1);
            }
        }
        i = tInformationMapper.updateByPrimaryKeySelective(tInformation);
        return i;
    }
}
