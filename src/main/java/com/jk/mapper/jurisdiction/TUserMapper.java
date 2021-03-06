package com.jk.mapper.jurisdiction;

import com.jk.entity.jurisdiction.TUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserMapper {
    int deleteByPrimaryKey(List<String> ids);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUser user);

    List<TUser> listUserByPort(List<String> deptId);

    List<TUser> listUserByPortMap(List<String> deptId);

    TUser selectByPrimaryKey(String userId);

    TUser selectByNamePas(TUser user);

    TUser selectByNamePhone(@Param(value = "phone") String phone);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    TUser selUserByLoginName(String loginName);

    TUser getUserByUserName(TUser tUser);
}