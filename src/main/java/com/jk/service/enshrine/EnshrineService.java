package com.jk.service.enshrine;

import com.jk.entity.reception.TEnshrine;

import java.util.List;
import java.util.Map;

public interface EnshrineService {
    int addEnshrine(TEnshrine tEnshrine);

    List<TEnshrine> selEnshrineList(TEnshrine tEnshrine);

    List<Map<String,Object>> selEnshrineListByport(TEnshrine tEnshrine);
}
