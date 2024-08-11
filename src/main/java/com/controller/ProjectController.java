package com.controller;

import com.service.ProjectService;
import com.service.impl.ProjectServiceImpl;
import com.util.ResponseDTO;
import com.vo.PageVo;
import com.vo.SearchPageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 李璟瑜
 * @date 2024/8/11 21:28
 * @description:
 */
@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService service;

    @ResponseBody
    @RequestMapping("/getAllProject")
    public ResponseDTO getAllProject(@RequestBody PageVo vo){
        ResponseDTO responseDTO = service.getAllProject(vo);
        return responseDTO;
    }

    @ResponseBody
    @RequestMapping("/searchProject")
    public ResponseDTO searchProject(@RequestBody SearchPageVo vo){
        ResponseDTO responseDTO = service.searchProjectByName(vo);
        return responseDTO;
    }


}
