package com.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FOrder {
    /**
     * 订单表（f_order）
     */
    private Integer id;

    /**
     * 订货人(外键用户表)
     */
    private String fUser;

    /**
     * 快递单编号
     */
    private Integer parcelid;

    /**
     * 创建时间
     */
    private Date time;

    /**
     * 支付总金额
     */
    private Double price;

    /**
     * 支付时间
     */
    private String date;

    /**
     * 外键地址表
     */
    private String fSite;

    /**
     * 订单状态(0未发货1已发货3确认收货4退货)
     */
    private Integer state;

    /**
     * 收货时间
     */
    private String datetime;

    /**
     * 支付宝订单编号
     */
    private String outTradeNo;
    List<FOrderp> getForderp;
}

