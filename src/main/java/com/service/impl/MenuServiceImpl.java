package com.service.impl;

import com.mapper.PhyMenuMapper;
import com.pojo.PhyMenu;
import com.service.MenuService;
import com.util.ListInTree;
import com.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李璟瑜
 * @date 2024/8/8 11:02
 * @description:
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    PhyMenuMapper mapper;
    @Override
    public ResponseDTO searchMenuByRoleInTree(int roleId) {
        List<PhyMenu> phyMenus = mapper.searchMenuByRole(roleId);
        ArrayList<PhyMenu> phyMenusInTree = ListInTree.turnToTree(phyMenus);
        return ResponseDTO.success(phyMenusInTree);
    }
}
