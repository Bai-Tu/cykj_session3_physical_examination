package com.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
@Data
public class PhyOrder {
    private Integer orderId;

    private Integer orderNumber;

    private Integer patientId;

    private Date orderCreateTime;

    private String orderStatus;

    private BigDecimal orderPrice;
}