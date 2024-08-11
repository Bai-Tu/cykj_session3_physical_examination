package com.mapper;

import com.pojo.PhyProject;

import java.util.List;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
public interface PhyProjectMapper {
    int deleteByPrimaryKey(Integer projectId);

    int insert(PhyProject record);

    int insertSelective(PhyProject record);

    PhyProject selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(PhyProject record);

    int updateByPrimaryKey(PhyProject record);
    List<PhyProject> getAllProject();
    List<PhyProject> selectAllByProjectName(String name);
}