package com.jk.service.information.impl;

import com.jk.entity.reception.TEvaluate;
import com.jk.entity.reception.TInformation;
import com.jk.mapper.reception.TEvaluateMapper;
import com.jk.mapper.reception.TInformationMapper;
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
    private String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss");
    @Autowired
    TInformationMapper tInformationMapper;
    @Autowired
    TEvaluateMapper tEvaluateMapper;

    /**
     * 资讯列表数据查询
     * @param tInformation
     * @return
     */
    @Override
    public List<TInformation> selectByExample(TInformation tInformation) {
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
        tInformation.settId(UUIDUtil.getUUID());
        tInformation.settCreateTime(dateNow);
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
     * 资讯点赞（接口）
     * @param tInformation
     * @param index 1:点赞 0：取消赞
     * @return
     */
    @Override
    public int prais(TInformation tInformation, String index) {
        TInformation informationByTid = tInformationMapper.getInformationByTid(tInformation);
        if(StringUtils.equals("1", index)){
            tInformation.settPraise(informationByTid.gettPraise()+1);
        }else{
            tInformation.settPraise(informationByTid.gettPraise()-1);
        }
        return tInformationMapper.updateByPrimaryKeySelective(tInformation);
    }

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
        tEvaluate.settType("3");//评论类型，0：拼车，1：店铺；2：活动；3：资讯
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
