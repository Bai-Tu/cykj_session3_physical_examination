package com.mapper;

import com.pojo.PhySubitemConclution;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
public interface PhySubitemConclutionMapper {
    int deleteByPrimaryKey(Integer subitemConclutionId);

    int insert(PhySubitemConclution record);

    int insertSelective(PhySubitemConclution record);

    PhySubitemConclution selectByPrimaryKey(Integer subitemConclutionId);

    int updateByPrimaryKeySelective(PhySubitemConclution record);

    int updateByPrimaryKey(PhySubitemConclution record);
}