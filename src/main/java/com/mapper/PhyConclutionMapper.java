package com.mapper;

import com.pojo.PhyConclution;

/**
 * @author 李璟瑜
 * @date 2024/8/13 8:40
 * @description:
 */
public interface PhyConclutionMapper {
    int deleteByPrimaryKey(Integer conclutionId);

    int insert(PhyConclution record);

    int insertSelective(PhyConclution record);

    PhyConclution selectByPrimaryKey(Integer conclutionId);

    int updateByPrimaryKeySelective(PhyConclution record);

    int updateByPrimaryKey(PhyConclution record);
}