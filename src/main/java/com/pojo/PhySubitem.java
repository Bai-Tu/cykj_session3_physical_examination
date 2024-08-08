package com.pojo;

import lombok.Data;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
@Data
public class PhySubitem {
    /**
    * id
    */
    private Integer subitemId;

    /**
    * 名字
    */
    private String subitemName;

    /**
    * 标准值
    */
    private String subitemStandard;
}