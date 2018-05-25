package com.elight.mapper;

import com.elight.model.SYS_PERMISSION;

public interface SYS_PERMISSIONMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SYS_PERMISSION record);

    int insertSelective(SYS_PERMISSION record);

    SYS_PERMISSION selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SYS_PERMISSION record);

    int updateByPrimaryKey(SYS_PERMISSION record);
}