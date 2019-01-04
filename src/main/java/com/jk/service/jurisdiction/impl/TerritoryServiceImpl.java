package com.jk.service.jurisdiction.impl;

import com.jk.entity.jurisdiction.TTerritory;
import com.jk.mapper.jurisdiction.TTerritoryMapper;
import com.jk.service.jurisdiction.TerritoryService;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerritoryServiceImpl implements TerritoryService {

    @Autowired
    TTerritoryMapper tTerritoryMapper;


    @Override
    public int insertSelective(TTerritory record) {
        record.setId(UUIDUtil.getUUID());
        return tTerritoryMapper.insertSelective(record);
    }

    @Override
    public List<TTerritory> selectByExample(TTerritory record) {
        return tTerritoryMapper.selectByExample(record);
    }

    @Override
    public TTerritory selectByPrimaryKey(String id) {
        return tTerritoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(List<String> ids) {
        return tTerritoryMapper.deleteByPrimaryKey(ids);
    }

    @Override
    public int updateByPrimaryKeySelective(TTerritory record) {
        return tTerritoryMapper.updateByPrimaryKeySelective(record);
    }
}
