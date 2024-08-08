package com.mapper;

import com.pojo.PhyMenu;

import java.util.List;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
public interface PhyMenuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(PhyMenu record);

    int insertSelective(PhyMenu record);

    PhyMenu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(PhyMenu record);

    int updateByPrimaryKey(PhyMenu record);
    List<PhyMenu> searchMenuByRole(int roleId);
    List<PhyMenu> searchAll();
    List<PhyMenu> getDifferentTree(int roleId);
}