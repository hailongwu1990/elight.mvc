package com.elight.mapper;

import com.elight.model.sys_item;

public interface sys_itemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sys_item record);

    int insertSelective(sys_item record);

    sys_item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sys_item record);

    int updateByPrimaryKey(sys_item record);
}