package com.pojo;

import lombok.Data;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
@Data
public class PhySubitemConclution {
    private Integer subitemConclutionId;

    private Integer subitemId;

    /**
    * 订单编号
    */
    private String orderNameber;

    private String subitemConclution;
}