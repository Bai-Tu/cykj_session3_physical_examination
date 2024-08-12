package com.controller;

import com.service.ComboService;
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
 * @date 2024/8/12 20:39
 * @description:
 */
@Controller
@RequestMapping("/combo")
public class ComboController {

    @Autowired
    ComboService service;

    @ResponseBody
    @RequestMapping("/getAllComboByPage")
    public ResponseDTO getAllComboByPage(@RequestBody PageVo vo){
        ResponseDTO responseDTO = service.getAllComboByPage(vo);
        return responseDTO;
    }

    @ResponseBody
    @RequestMapping("/searchCombo")
    public ResponseDTO searchCombo(@RequestBody SearchPageVo vo){
        ResponseDTO responseDTO = service.searchCombo(vo);
        return responseDTO;
    }


}
