package com.mapper;

import com.pojo.PhySubitem;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
public interface PhySubitemMapper {
    int deleteByPrimaryKey(Integer subitemId);

    int insert(PhySubitem record);

    int insertSelective(PhySubitem record);

    PhySubitem selectByPrimaryKey(Integer subitemId);

    int updateByPrimaryKeySelective(PhySubitem record);

    int updateByPrimaryKey(PhySubitem record);
}