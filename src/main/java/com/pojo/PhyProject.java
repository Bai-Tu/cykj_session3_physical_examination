package com.pojo;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 李璟瑜
 * @date 2024/8/8 10:57
 * @description:
 */
@Data
public class PhyProject {
    /**
    * id
    */
    private Integer projectId;

    /**
    * 项目名
    */
    private String projectName;

    /**
    * 项目价格
    */
    private BigDecimal projectPrice;

    /**
    * 项目状态
    */
    private Integer projectStatus;
}