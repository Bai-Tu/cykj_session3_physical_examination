package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.PhyProjectMapper;
import com.pojo.PhyProject;
import com.service.ProjectService;
import com.util.ResponseDTO;
import com.vo.PageVo;
import com.vo.SearchPageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李璟瑜
 * @date 2024/8/11 21:31
 * @description:
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    PhyProjectMapper mapper;

    @Override
    public ResponseDTO getAllProject(PageVo vo) {
        PageHelper.startPage(vo.getPagen(), vo.getLimit());
        List<PhyProject> allProject = mapper.getAllProject();
        PageInfo<PhyProject> pageInfo = new PageInfo<>(allProject);
        return ResponseDTO.success(pageInfo);
    }

    @Override
    public ResponseDTO searchProjectByName(SearchPageVo vo) {
        PageHelper.startPage(vo.getPagen(), vo.getLimit());
        List<PhyProject> phyProjects = mapper.selectAllByProjectName(vo.getName());
        PageInfo<PhyProject> pageInfo = new PageInfo<>(phyProjects);
        return ResponseDTO.success(pageInfo);
    }
}
