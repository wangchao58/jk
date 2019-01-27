package com.jk.service.evaluate;

import com.jk.entity.reception.TEvaluate;

import java.util.List;
import java.util.Map;

public interface EvaluateServicr {
    int addEvaluate(TEvaluate tEvaluate);

    List<TEvaluate> selTEvaluateList(TEvaluate tEvaluate);

    List<Map<String,Object>> selTEvaluateListByPort(TEvaluate tEvaluate);
}
