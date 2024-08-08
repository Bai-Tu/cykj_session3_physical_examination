package com.controller;

import com.util.CheckCode;
import com.util.ImageCodeUtils;
import com.util.ResponseDTO;
import com.vo.LoginVo;
import com.vo.RegisterVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author 李璟瑜
 * @date 2024/8/7 16:24
 * @description:
 */
@Controller
@CrossOrigin
@RequestMapping("/patient")
public class PatientController {

    @ResponseBody
    @RequestMapping("/refreshCheckCode")
    public void refreshCheckCode(HttpServletResponse response, HttpSession session){
        ImageCodeUtils imageCodeUtils = new ImageCodeUtils();
        session.setAttribute("code",imageCodeUtils.getCode());
        try {
            imageCodeUtils.write(response.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @ResponseBody
    @RequestMapping("/registerPatient")
    public ResponseDTO registerPatient(@RequestBody RegisterVo vo, HttpSession session){
        if (vo.getCode().equals(session.getAttribute("code"))){
            return adminService.loginAdmin(vo);
        }else {
            return new ResponseDTO(-2, "验证码错误", null);
        }
    }
}
