package com.mapper;

import com.pojo.PhyComboProjectConnet;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
public interface PhyComboProjectConnetMapper {
    int deleteByPrimaryKey(Integer comboProjectConnetId);

    int insert(PhyComboProjectConnet record);

    int insertSelective(PhyComboProjectConnet record);

    PhyComboProjectConnet selectByPrimaryKey(Integer comboProjectConnetId);

    int updateByPrimaryKeySelective(PhyComboProjectConnet record);

    int updateByPrimaryKey(PhyComboProjectConnet record);
}