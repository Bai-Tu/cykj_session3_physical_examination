package com.service;

import com.util.ResponseDTO;
import com.vo.LoginVo;

/**
 * @author 李璟瑜
 * @date 2024/8/7 15:13
 * @description:
 */
public interface AdminService {
    ResponseDTO adminLogin(LoginVo vo);
    ResponseDTO getAllAdmin();
}
