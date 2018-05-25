package com.elight.mapper;

import com.elight.model.SYS_USER;

public interface SYS_USERMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SYS_USER record);

    int insertSelective(SYS_USER record);

    SYS_USER selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SYS_USER record);

    int updateByPrimaryKey(SYS_USER record);
}