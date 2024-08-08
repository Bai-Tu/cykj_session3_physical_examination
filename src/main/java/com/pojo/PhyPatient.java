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
public class PhyPatient {
    /**
     * id
     */
    private Integer patientId;

    /**
     * 名字
     */
    private String patientName;

    /**
     * 密码
     */
    private String patientPassword;

    /**
     * 余额
     */
    private BigDecimal patientBuddget;

    /**
     * 电话
     */
    private String patientPhone;

    /**
     * 身份证
     */
    private String patientIdentity;

    /**
     * 年龄
     */
    private String patientAge;

    /**
     * 注册时间
     */
    private Date patientCreateTime;
}