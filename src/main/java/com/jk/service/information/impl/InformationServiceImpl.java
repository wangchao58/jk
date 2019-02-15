package com.jk.service.information.impl;

import com.jk.entity.reception.TInformation;
import com.jk.entity.reception.TPersonage;
import com.jk.mapper.reception.TInformationMapper;
import com.jk.mapper.reception.TPersonageMapper;
import com.jk.service.information.InformationService;
import com.jk.util.DateUtil;
import com.jk.util.UUIDUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    TInformationMapper tInformationMapper;
    @Autowired
    TPersonageMapper tPersonageMapper;

    /**
     * 资讯列表数据查询
     * @param tInformation
     * @return
     */
    @Override
    public List<TInformation> selectByExample(TInformation tInformation) {
        // 根据发布人微信昵称查询pId(openid)
        TPersonage tPersonage = tPersonageMapper.selOpenidByNickName(tInformation.getpId());
        if(null != tPersonage && StringUtils.isNotBlank(tPersonage.gettId())){
            tInformation.setpId(tPersonage.gettId());
        }
        if(StringUtils.equals("undefined",tInformation.gettContent())){
            tInformation.settContent("");
        }
        return tInformationMapper.selectByExample(tInformation);
    }

    /**
     * 资讯编辑查询数据
     * @param id
     * @return
     */
    @Override
    public TInformation selectByPrimaryKey(String id) {
        return tInformationMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除资讯信息
     * @param idlist
     * @return
     */
    @Override
    public int deleteByPrimaryKey(List<String> idlist) {
        return tInformationMapper.deleteByPrimaryKey(idlist);
    }

    @Override
    public int insertInformation(TInformation tInformation) {
        String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss");
        tInformation.settId(UUIDUtil.getUUID());
        tInformation.settCreateTime(dateNow);
        tInformation.settPraise(0);
        tInformation.settEvaluate(0);
        tInformation.settViewsNum(0);
        tInformation.settCollectionNum(0);
        return tInformationMapper.insertSelective(tInformation);
    }

    @Override
    public int updateInformation(TInformation tInformation) {
        return tInformationMapper.updateByPrimaryKeySelective(tInformation);
    }

    /**
     * 获取资讯详情（接口）
     * @param tInformation
     * @return
     */
    @Override
    public TInformation getInformationByTid(TInformation tInformation) {
        return tInformationMapper.getInformationByTid(tInformation);
    }

    /**
     * 资讯前端删除（接口）
     * @param tInformation
     * @return
     */
    @Override
    public int removeInformation(TInformation tInformation) {
        return tInformationMapper.removeByPrimaryKey(tInformation);
    }


}
