package com.jk.service.complain;

import com.jk.entity.reception.TComplain;

import java.util.List;

public interface ComplainService {

    int insertSelective(TComplain record);

    List<TComplain> selectByExample(TComplain tComplain);
}
