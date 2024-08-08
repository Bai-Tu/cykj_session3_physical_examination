package com.controller;

import com.service.AdminService;
import com.util.ResponseDTO;
import com.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 李璟瑜
 * @date 2024/8/7 15:19
 * @description:
 */
@CrossOrigin
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService service;

    @ResponseBody
    @RequestMapping("/adminLogin")
    public ResponseDTO adminLogin(@RequestBody LoginVo vo){
        ResponseDTO responseDTO = service.adminLogin(vo);
        return responseDTO;
    }

}
