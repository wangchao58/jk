package com.jk.service.jurisdiction.impl;

import com.github.pagehelper.StringUtil;
import com.jk.entity.jurisdiction.TUser;
import com.jk.mapper.jurisdiction.TUserMapper;
import com.jk.mapper.jurisdiction.TUserRoleMapper;
import com.jk.service.jurisdiction.UserService;
import com.jk.util.DateUtil;
import com.jk.util.Md5Util;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    TUserMapper tUserMapper;

    @Autowired
    TUserRoleMapper tUserRoleMapper;

//    @Autowired
//    TRestMapper tRestMapper;

    @Override
    public List<TUser> selectByExample(TUser user) {
        return tUserMapper.selectByExample(user);
    }

    @Override
    public List<TUser> listUserByPort(List<String> deptId) {
        List<TUser> tUserList = tUserMapper.listUserByPort(deptId);
        return tUserList;
    }

//    @Override
//    public List<Map<String,Object>> listUserByPortMap(List<String> deptId) {
//        List<TUser> tUserList = tUserMapper.listUserByPortMap(deptId);
//        List<String> listDate = DateUtil.getWeekOfTime();
//        List<TRest> listRest = tRestMapper.seleDateStaffRortMap(deptId.get(0));
//        List<Map<String,Object>> listMap = new ArrayList<>();
//        for(TUser user : tUserList){
//            Map<String,Object> maps = new HashMap<>();
//            maps.put("user" ,user);
//            List<Map<String,Object>> listMapTime = new ArrayList<>();
//            for(String tiem :listDate) {
//                Map<String,Object> maptime = new HashMap<>();
//                for(TRest rest: listRest) {
//                    if(rest.getStaffId().equals(user.getUserId()) && tiem.equals(rest.getIsDate().substring(5,rest.getIsDate().length())) ) {
//                        maptime.put("ist","yishezhi mr20");
//                    }
//                }
//                maptime.put("time",tiem);
//                listMapTime.add(maptime);
//            }
//            maps.put("listDate",listMapTime);
//            listMap.add(maps);
//        }
//
//        return listMap;
//    }

    @Override
    public int insertSelective(TUser record) {
        TUser tUser = tUserMapper.selUserByLoginName(record.getLoginName());
        if(null != tUser){
            return 2;
        }
        record.setPassword(Md5Util.md5(record.getPassword()));
        record.setAddTime(new Date());
        record.setUserId(UUIDUtil.getUUID());
        return tUserMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TUser record) {
        if(StringUtil.isNotEmpty(record.getPassword())) {
            record.setPassword(Md5Util.md5(record.getPassword()));
        }
        return tUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(List<String> ids) {
        int i = 0;
        i = tUserMapper.deleteByPrimaryKey(ids);
        if(0 != i){
            // 删除用户时，同时删除角色
            i = tUserRoleMapper.deleteUserRole(ids);
        }
        return i;
    }

    @Override
    public TUser selectByPrimaryKey(String userId) {
        return tUserMapper.selectByPrimaryKey(userId);
    }

    /**
     * 登录
     * @param user
     * @return
     */
    @Override
    public TUser selectByNamePas(TUser user) {
        return tUserMapper.selectByNamePas(user);
    }
}
