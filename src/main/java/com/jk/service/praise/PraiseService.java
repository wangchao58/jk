package com.jk.service.praise;

import com.jk.entity.reception.TPraise;

import java.util.List;
import java.util.Map;

public interface PraiseService {
    int addPraise(TPraise tPraise);

    List<Map<String,Object>> listPraise(TPraise tPraise);
}
