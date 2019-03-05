package com.jk.util;

import com.jk.entity.reception.TStore;

import java.util.List;

public class ItemSortUtil {

    public static List<TStore> getDistanceAndResidueSeat(List<TStore> list) {
        TStore tStore = null;
        boolean exchange = false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 2; j >= i; j--) {
                if (list.get(j + 1).getDistance() < list.get(j).getDistance()) {
                    tStore = list.get(j + 1);
                    list.set(j + 1, (TStore) list.get(j));
                    list.set(j, tStore);
                    exchange = true;
                }
            }
            if (!exchange)
                break;
        }
        return list;
    }
}
