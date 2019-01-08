package com.jk.mapper.reception;

import com.jk.entity.reception.TEvaluate;
import com.jk.entity.reception.TEvaluateExample;
import java.util.List;

public interface TEvaluateMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TEvaluate record);

    int insertSelective(TEvaluate record);

    List<TEvaluate> selectByExample(TEvaluateExample example);

    TEvaluate selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TEvaluate record);

    int updateByPrimaryKey(TEvaluate record);
}