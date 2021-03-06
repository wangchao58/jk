package com.jk.service.jurisdiction.impl;

import com.jk.entity.jurisdiction.TUserRole;
import com.jk.mapper.jurisdiction.TUserRoleMapper;
import com.jk.service.jurisdiction.TUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TUserRoleServiceImpl implements TUserRoleService {

    @Autowired
    TUserRoleMapper tUserRoleMapper;

    @Override
    public int insert(TUserRole record) {
        List<String> roleIds = Arrays.asList(record.getRoleId().split(","));
        tUserRoleMapper.deleteByPrimaryKey(record.getUserId());
        Map<String,Object> mapUserRole = new HashMap<>();
        mapUserRole.put("userId",record.getUserId());
        mapUserRole.put("roleId",roleIds);
        int i = tUserRoleMapper.insert(mapUserRole);
        return i;
    }
}
