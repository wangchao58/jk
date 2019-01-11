package com.jk.service.evaluate;

import com.jk.entity.reception.TEvaluate;

import java.util.List;

public interface EvaluateServicr {
    int addEvaluate(TEvaluate tEvaluate);

    List<TEvaluate> selTEvaluateList(TEvaluate tEvaluate);
}
