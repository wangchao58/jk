package com.jk.mapper.jurisdiction;

import com.jk.entity.jurisdiction.TRole;

import java.util.List;

public interface TRoleMapper {
    int deleteByPrimaryKey(String roleId);

    int deleteByListKey(List<String> ids);

    int insert(TRole record);

    int insertSelective(TRole record);

    List<TRole> selectByExample(TRole role);

    TRole selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}