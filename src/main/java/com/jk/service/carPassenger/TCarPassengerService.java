package com.jk.service.carPassenger;

import com.jk.entity.reception.TCarPassenger;
import com.jk.entity.reception.TCarPassengerExample;

import java.util.List;

public interface TCarPassengerService {

    int deleteByPrimaryKey(String tId);

    int insertSelective(TCarPassenger record);

    List<TCarPassenger> selectByExample(TCarPassenger record);

    TCarPassenger selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TCarPassenger record);

}
