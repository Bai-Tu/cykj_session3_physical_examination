package com.mapper;

import com.pojo.PhyOrderContext;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
public interface PhyOrderContextMapper {
    int deleteByPrimaryKey(Integer orderContextId);

    int insert(PhyOrderContext record);

    int insertSelective(PhyOrderContext record);

    PhyOrderContext selectByPrimaryKey(Integer orderContextId);

    int updateByPrimaryKeySelective(PhyOrderContext record);

    int updateByPrimaryKey(PhyOrderContext record);
}