package com.mapper;

import com.pojo.PhyOrder;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
public interface PhyOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(PhyOrder record);

    int insertSelective(PhyOrder record);

    PhyOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(PhyOrder record);

    int updateByPrimaryKey(PhyOrder record);
}