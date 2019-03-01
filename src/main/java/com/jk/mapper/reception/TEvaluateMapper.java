package com.jk.mapper.reception;

import com.jk.entity.reception.TEvaluate;
import com.jk.entity.reception.TEvaluateExample;
import java.util.List;
import java.util.Map;

public interface TEvaluateMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TEvaluate record);

    int insertSelective(TEvaluate record);

    List<TEvaluate> selectByExample(TEvaluate tEvaluate);

    List<Map<String, Object>> selTEvaluateListByPort(TEvaluate tEvaluate);

    TEvaluate selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TEvaluate record);

    int updateByPrimaryKey(TEvaluate record);

    int removeByPrimaryKey(String tOtherId);

    int removeByHids(List<String> ids);
}