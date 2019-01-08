package com.jk.mapper.reception;

import com.jk.entity.reception.TCarOwner;
import com.jk.entity.reception.TCarOwnerExample;
import java.util.List;

public interface TCarOwnerMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TCarOwner record);

    int insertSelective(TCarOwner record);

    List<TCarOwner> selectByExampleWithBLOBs(TCarOwnerExample example);

    List<TCarOwner> selectByExample(TCarOwnerExample example);

    TCarOwner selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TCarOwner record);

    int updateByPrimaryKeyWithBLOBs(TCarOwner record);

    int updateByPrimaryKey(TCarOwner record);
}