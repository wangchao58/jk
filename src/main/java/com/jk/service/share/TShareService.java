package com.jk.service.share;

import com.jk.entity.reception.TShare;

import java.util.List;

public interface TShareService {
    int deleteByPrimaryKey(String ids);

    int insertSelective(TShare record);

    List<TShare> selectByExample(TShare example);

    TShare selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TShare record);

}
