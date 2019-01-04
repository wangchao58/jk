package com.jk.service.tree;

import com.jk.entity.jurisdiction.TMenu;

import java.util.Map;

public interface TreeService {

    String selectByExample(Map<String, Object> map);

    String selectByLisAll(TMenu menu);
}
