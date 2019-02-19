package com.jk.service.jurisdiction;

import com.jk.entity.jurisdiction.TUser;

import java.util.List;

public interface UserService {

    List<TUser> selectByExample(TUser user);

    List<TUser> listUserByPort(List<String> deptId);

//    List<Map<String,Object>> listUserByPortMap(List<String> deptId);

    int insertSelective(TUser record);

    int updateByPrimaryKeySelective(TUser record);

    int deleteByPrimaryKey(List<String> ids);

    TUser selectByPrimaryKey(String userId);

    TUser selectByNamePas(TUser user);

    TUser getUserByUserName(TUser tUser);
}
