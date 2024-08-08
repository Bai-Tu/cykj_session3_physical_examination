package com.service.impl;

import com.mapper.PhyAdminMapper;
import com.pojo.PhyAdmin;
import com.service.AdminService;
import com.util.JwtUtil;
import com.util.Md5;
import com.util.ResponseDTO;
import com.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author 李璟瑜
 * @date 2024/8/7 15:14
 * @description:
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    PhyAdminMapper mapper;
    @Override
    public ResponseDTO adminLogin(LoginVo vo) {
        String encrypted = Md5.getEncrypted(vo.getPwd());
        PhyAdmin phyAdmin = mapper.loginAdmin(vo.getAcc(), encrypted);
        if (phyAdmin != null){
            if (phyAdmin.getAdminStatus() == 1){
                HashMap<String,Object> data = new HashMap<>();
                data.put("adminInfo",phyAdmin);
                String token = JwtUtil.generateToken(data);
                return ResponseDTO.success(token);
            }else {
                return new ResponseDTO(-101,"账户冻结",null);
            }

        }
        return ResponseDTO.fail();
    }
}
