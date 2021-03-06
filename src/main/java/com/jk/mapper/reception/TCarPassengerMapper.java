package com.jk.mapper.reception;

import com.jk.entity.reception.TCarPassenger;
import com.jk.entity.reception.TCarPassengerExample;
import java.util.List;

public interface TCarPassengerMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TCarPassenger record);

    int insertSelective(TCarPassenger record);

    List<TCarPassenger> selectByExample(TCarPassenger record);

    TCarPassenger selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TCarPassenger record);

    int updateByPrimaryKey(TCarPassenger record);
}