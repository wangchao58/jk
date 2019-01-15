package com.jk.mapper.reception;

import com.jk.entity.reception.TPraise;
import com.jk.entity.reception.TPraiseExample;
import java.util.List;

public interface TPraiseMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TPraise record);

    int insertSelective(TPraise record);

    List<TPraise> selectByExample(TPraiseExample example);

    TPraise selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TPraise record);

    int updateByPrimaryKey(TPraise record);

    TPraise selectPraise(TPraise tPraise);
}