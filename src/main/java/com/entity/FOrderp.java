package com.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FOrderp {
    /**
     * 订单详情（f_orderP）
     */
    private Integer id;

    /**
     * 商品编号(外键商品表)
     */
    private Integer book;

    /**
     * 商品数量
     */
    private Integer num;

    /**
     * 金额
     */
    private BigDecimal price;

    /**
     * 总金额
     */
    private Long money;

    /**
     * 订单表编号(订单表)
     */
    private Integer fOrder;

    /**
     * 状态(  0：未评价  1：评价  )
     */
    private Integer state;
}

