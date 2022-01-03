package com.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("f_cart")
public class FCart {
    /**
     * 购物车（f_cart）
     */
    @TableId
    private Integer id;

    /**
     * 用户编号(外键用户表)
     */
    private Integer fUser;

    /**
     * 商品编号(外键商品表)
     */
    private Integer book;

    /**
     * 添加时间
     */
    private String time;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 价格
     */
    private BigDecimal price;
}

