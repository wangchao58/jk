package com.jk.service.jurisdiction;

import com.jk.entity.jurisdiction.TTerritory;

import java.util.List;

public interface TerritoryService {

    int insertSelective(TTerritory record);

    List<TTerritory> selectByExample(TTerritory record);

    TTerritory selectByPrimaryKey(String id);

    int deleteByPrimaryKey(List<String> ids);

    int updateByPrimaryKeySelective(TTerritory record);
}
