package com.jk.mapper.reception;

import com.jk.entity.reception.TApply;
import com.jk.entity.reception.TApplyExample;
import java.util.List;

public interface TApplyMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TApply record);

    int insertSelective(TApply record);

    List<TApply> selectByExample(TApplyExample example);

    TApply selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TApply record);

    int updateByPrimaryKey(TApply record);
}