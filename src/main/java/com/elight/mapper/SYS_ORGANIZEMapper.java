package com.elight.mapper;

import com.elight.model.SYS_ORGANIZE;

public interface SYS_ORGANIZEMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SYS_ORGANIZE record);

    int insertSelective(SYS_ORGANIZE record);

    SYS_ORGANIZE selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SYS_ORGANIZE record);

    int updateByPrimaryKey(SYS_ORGANIZE record);
}