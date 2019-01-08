package com.jk.service.information.impl;

import com.jk.entity.reception.TInformation;
import com.jk.mapper.reception.TInformationMapper;
import com.jk.service.information.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    TInformationMapper tInformationMapper;

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
}
