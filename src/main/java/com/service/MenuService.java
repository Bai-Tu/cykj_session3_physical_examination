package com.service;

import com.util.ResponseDTO;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:42
 * @description:
 */
public interface MenuService {
    ResponseDTO searchMenuByRoleInTree(int roleId);
}
