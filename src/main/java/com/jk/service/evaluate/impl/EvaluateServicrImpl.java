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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class EvaluateServicrImpl implements EvaluateServicr {

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
        String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm");
        TInformation tInformation = new TInformation();
        tInformation.settId(tEvaluate.gettOtherId());
        TInformation informationByTid = tInformationMapper.selectByPrimaryKeyByprore(tEvaluate.gettOtherId());

        tEvaluate.settId(UUIDUtil.getUUID());
        tEvaluate.setCreateTime(dateNow);
        tEvaluate.setfId(informationByTid.getpId());
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
        List<TEvaluate> evaluateList = new ArrayList<>();
        List<TEvaluate> tEvaluates = tEvaluateMapper.selectByExample(tEvaluate);
        for (TEvaluate evaluate : tEvaluates) {
            String createTime = evaluate.getCreateTime().substring(0,16);
            evaluate.setCreateTime(createTime);
            evaluateList.add(evaluate);
        }
        return evaluateList;
    }

    @Override
    public List<Map<String, Object>> selTEvaluateListByPort(TEvaluate tEvaluate) {
        List<Map<String, Object>> tEvaluatesByMap = tEvaluateMapper.selTEvaluateListByPort(tEvaluate);
        return tEvaluatesByMap;
    }
}
