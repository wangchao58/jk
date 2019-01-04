package com.jk.service.jurisdiction;

import com.jk.entity.jurisdiction.TRole;

import java.util.List;

public interface RoleService {

    List<TRole> selectByExample(TRole role);

    int insertSelective(TRole record);

    int updateByPrimaryKeySelective(TRole record);

    int deleteByListKey(List<String> ids);

    TRole selectByPrimaryKey(String roleId);
}
