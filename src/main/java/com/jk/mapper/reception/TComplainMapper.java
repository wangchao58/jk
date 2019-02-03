package com.jk.mapper.reception;

import com.jk.entity.reception.TComplain;
import com.jk.entity.reception.TComplainExample;
import java.util.List;

public interface TComplainMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TComplain record);

    int insertSelective(TComplain record);

    List<TComplain> selectByExample(TComplainExample example);

    TComplain selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TComplain record);

    int updateByPrimaryKey(TComplain record);
}