package com.mapper;

import com.pojo.PhyCombo;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
public interface PhyComboMapper {
    int deleteByPrimaryKey(Integer comboId);

    int insert(PhyCombo record);

    int insertSelective(PhyCombo record);

    PhyCombo selectByPrimaryKey(Integer comboId);

    int updateByPrimaryKeySelective(PhyCombo record);

    int updateByPrimaryKey(PhyCombo record);
}