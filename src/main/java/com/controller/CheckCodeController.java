package com.controller;

import com.util.ImageCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 李璟瑜
 * @date 2024/8/8 13:18
 * @description:
 */
@Controller
@RequestMapping("/code")
public class CheckCodeController {
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
}
