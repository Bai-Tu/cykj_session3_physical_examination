package com.controller;

import com.mapper.PhyMenuMapper;
import com.pojo.PhyRole;
import com.service.MenuService;
import com.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:39
 * @description:
 */
@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    MenuService service;

    @ResponseBody
    @RequestMapping("/searchMenuByRoleInTree")
    public ResponseDTO searchMenuByRoleInTree(@RequestBody PhyRole role){
        ResponseDTO responseDTO = service.searchMenuByRoleInTree(role.getRoleId());
        return responseDTO;
    }
}
