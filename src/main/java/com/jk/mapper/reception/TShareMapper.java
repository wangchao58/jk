package com.jk.mapper.reception;

import com.jk.entity.reception.TShare;
import com.jk.entity.reception.TShareExample;
import java.util.List;

public interface TShareMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TShare record);

    int insertSelective(TShare record);

    List<TShare> selectByExample(TShare example);

    TShare selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TShare record);

    int updateByPrimaryKey(TShare record);
}