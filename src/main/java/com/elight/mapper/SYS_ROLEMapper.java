package com.elight.mapper;

import com.elight.model.SYS_ROLE;

public interface SYS_ROLEMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SYS_ROLE record);

    int insertSelective(SYS_ROLE record);

    SYS_ROLE selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SYS_ROLE record);

    int updateByPrimaryKey(SYS_ROLE record);
}