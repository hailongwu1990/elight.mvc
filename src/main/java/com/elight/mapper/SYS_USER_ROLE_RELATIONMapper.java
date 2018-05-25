package com.elight.mapper;

import com.elight.model.SYS_USER_ROLE_RELATION;

public interface SYS_USER_ROLE_RELATIONMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SYS_USER_ROLE_RELATION record);

    int insertSelective(SYS_USER_ROLE_RELATION record);

    SYS_USER_ROLE_RELATION selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SYS_USER_ROLE_RELATION record);

    int updateByPrimaryKey(SYS_USER_ROLE_RELATION record);
}