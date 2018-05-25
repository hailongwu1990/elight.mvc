package com.elight.mapper;

import com.elight.model.SYS_LOG;

public interface SYS_LOGMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SYS_LOG record);

    int insertSelective(SYS_LOG record);

    SYS_LOG selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SYS_LOG record);

    int updateByPrimaryKey(SYS_LOG record);
}