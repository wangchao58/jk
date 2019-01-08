package com.jk.mapper.reception;

import com.jk.entity.reception.TCarPassenger;
import com.jk.entity.reception.TCarPassengerExample;
import java.util.List;

public interface TCarPassengerMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TCarPassenger record);

    int insertSelective(TCarPassenger record);

    List<TCarPassenger> selectByExample(TCarPassengerExample example);

    TCarPassenger selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TCarPassenger record);

    int updateByPrimaryKey(TCarPassenger record);
}