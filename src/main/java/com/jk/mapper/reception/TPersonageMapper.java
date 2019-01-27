package com.jk.mapper.reception;

import com.jk.entity.reception.TPersonage;
import com.jk.entity.reception.TPersonageExample;
import java.util.List;

public interface TPersonageMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TPersonage record);

    int insertSelective(TPersonage record);

    List<TPersonage> selectByExample(TPersonage record);

    TPersonage selectByPrimaryKey(String tId);

    TPersonage selectByOpenId(String openId);

    int updateByPrimaryKeySelective(TPersonage record);

    int updateByPrimaryKey(TPersonage record);
}