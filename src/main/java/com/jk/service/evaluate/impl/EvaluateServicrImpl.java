package com.jk.service.evaluate.impl;

import com.jk.entity.reception.TEvaluate;
import com.jk.entity.reception.TInformation;
import com.jk.mapper.reception.TEvaluateMapper;
import com.jk.mapper.reception.TInformationMapper;
import com.jk.service.evaluate.EvaluateServicr;
import com.jk.util.DateUtil;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EvaluateServicrImpl implements EvaluateServicr {
    private String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss");

    @Autowired
    TEvaluateMapper tEvaluateMapper;
    @Autowired
    TInformationMapper tInformationMapper;

    /**
     * 资讯评论（接口）
     * @param tEvaluate
     * @return
     */
    @Override
    public int addEvaluate(TEvaluate tEvaluate) {
        int i = 0;
        TInformation tInformation = new TInformation();
        tInformation.settId(tEvaluate.gettOtherId());
        TInformation informationByTid = tInformationMapper.getInformationByTid(tInformation);

        tEvaluate.settId(UUIDUtil.getUUID());
        tEvaluate.setCreateTime(dateNow);
        i = tEvaluateMapper.insertSelective(tEvaluate);
        if(i > 0){
            // 修改评论条数
            tInformation.settEvaluate(informationByTid.gettEvaluate()+1);
            i = tInformationMapper.updateByPrimaryKeySelective(tInformation);
        }
        return i;
    }

    /**
     * 查询资讯评论信息（接口）
     * @param tEvaluate
     * @return
     */
    @Override
    public List<TEvaluate> selTEvaluateList(TEvaluate tEvaluate) {
        return tEvaluateMapper.selectByExample(tEvaluate);
    }
}
