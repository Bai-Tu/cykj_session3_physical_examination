package com.service.impl;

import com.mapper.AdminMapper;
import com.pojo.PhyAdmin;
import com.service.AdminService;
import com.util.ResponseDTO;
import com.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李璟瑜
 * @date 2024/8/7 15:14
 * @description:
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper mapper;
    @Override
    public ResponseDTO adminLogin(LoginVo vo) {
        PhyAdmin phyAdmin = mapper.loginAdmin(vo.getAcc(), vo.getPwd());
        if (phyAdmin != null){
            return ResponseDTO.success(phyAdmin);
        }
        return ResponseDTO.fail();
    }
}
