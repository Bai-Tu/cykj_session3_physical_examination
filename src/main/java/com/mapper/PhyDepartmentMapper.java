package com.mapper;

import com.pojo.PhyDepartment;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
public interface PhyDepartmentMapper {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(PhyDepartment record);

    int insertSelective(PhyDepartment record);

    PhyDepartment selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(PhyDepartment record);

    int updateByPrimaryKey(PhyDepartment record);
}