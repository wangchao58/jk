package com.jk.mapper.reception;

import com.jk.entity.reception.TCarOwner;
import com.jk.entity.reception.TCarOwnerExample;
import java.util.List;

public interface TCarOwnerMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TCarOwner record);

    int insertSelective(TCarOwner record);

    List<TCarOwner> selectByExample(TCarOwner example);

    TCarOwner selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TCarOwner record);

    int updateByPrimaryKey(TCarOwner record);
}