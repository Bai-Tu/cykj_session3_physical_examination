package com.util;

import com.pojo.PhyMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李璟瑜
 * @date 2024/8/8 11:07
 * @description:
 */
public class ListInTree {
//    列表转化
    public static ArrayList<PhyMenu> turnToTree(List<PhyMenu> allmenus) {
        ArrayList<PhyMenu> menuData = new ArrayList<>();
        for (PhyMenu menu : allmenus) {
            if (menu.getMenuParentId()==0){
                menuData.add(getChildMenu(menu,allmenus));
            }
        }
        return menuData;
    }


    public static PhyMenu getChildMenu(PhyMenu nowMenu, List<PhyMenu> allMenu){
        for (PhyMenu menu : allMenu) {
            if (nowMenu.getMenuId() == menu.getMenuParentId()){
                nowMenu.getChildren().add(getChildMenu(menu,allMenu));
            }
        }
        return nowMenu;
    }
}
