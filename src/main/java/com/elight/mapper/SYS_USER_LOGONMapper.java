package com.elight.mapper;

import com.elight.model.SYS_USER_LOGON;

public interface SYS_USER_LOGONMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SYS_USER_LOGON record);

    int insertSelective(SYS_USER_LOGON record);

    SYS_USER_LOGON selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SYS_USER_LOGON record);

    int updateByPrimaryKey(SYS_USER_LOGON record);
}