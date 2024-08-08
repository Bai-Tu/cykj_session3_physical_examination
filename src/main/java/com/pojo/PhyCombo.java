package com.pojo;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
@Data
public class PhyCombo {
    /**
    * 套餐id
    */
    private Integer comboId;

    /**
    * 套餐名
    */
    private String comboName;

    /**
    * 套餐价格
    */
    private BigDecimal comboPrice;
}