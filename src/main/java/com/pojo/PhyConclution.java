package com.pojo;

import lombok.Data;

/**
 * @author 李璟瑜
 * @date 2024/8/13 8:40
 * @description:
 */
@Data
public class PhyConclution {
    /**
     * 总结id
     */
    private Integer conclutionId;

    /**
     * 订单编号
     */
    private Integer orderNumber;

    /**
     * 总结内容
     */
    private String conclutionContent;
}