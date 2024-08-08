package com.vo;

import lombok.Data;

/**
 * @author 李璟瑜
 * @date 2024/8/8 16:39
 * @description:
 */
@Data
public class DepartmentPageVo {
    private int pagen;
    private int limit;
    private String departmentName;
}
