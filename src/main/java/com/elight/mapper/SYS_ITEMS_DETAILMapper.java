package com.elight.mapper;

import com.elight.model.SYS_ITEMS_DETAIL;

public interface SYS_ITEMS_DETAILMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SYS_ITEMS_DETAIL record);

    int insertSelective(SYS_ITEMS_DETAIL record);

    SYS_ITEMS_DETAIL selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SYS_ITEMS_DETAIL record);

    int updateByPrimaryKey(SYS_ITEMS_DETAIL record);
}