package com.jk.mapper.jurisdiction;

import com.jk.entity.jurisdiction.TMenuRole;

import java.util.List;
import java.util.Map;

public interface TMenuRoleMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(Map<String, Object> map);

    int insertSelective(TMenuRole record);

    List<String> selectByExample(String roleId);

    TMenuRole selectByPrimaryKey(String menuRoleId);

    int updateByPrimaryKeySelective(TMenuRole record);

    int updateByPrimaryKey(TMenuRole record);
}