package com.elight.mapper;

import com.elight.model.SYS_ROLE_AUTHORIZE;

public interface SYS_ROLE_AUTHORIZEMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SYS_ROLE_AUTHORIZE record);

    int insertSelective(SYS_ROLE_AUTHORIZE record);

    SYS_ROLE_AUTHORIZE selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SYS_ROLE_AUTHORIZE record);

    int updateByPrimaryKey(SYS_ROLE_AUTHORIZE record);
}