package com.jk.service.enshrine;

import com.jk.entity.reception.TEnshrine;

import java.util.List;

public interface EnshrineService {
    int addEnshrine(TEnshrine tEnshrine);

    List<TEnshrine> selEnshrineList(TEnshrine tEnshrine);
}
