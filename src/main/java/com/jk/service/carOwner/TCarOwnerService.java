package com.jk.service.carOwner;

import com.jk.entity.reception.TCarOwner;

import java.util.List;

public interface TCarOwnerService {

    int deleteByPrimaryKey(String ids);

    int insertSelective(TCarOwner record);

    List<TCarOwner> selectByExample(TCarOwner example);

    TCarOwner selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TCarOwner record);

}
