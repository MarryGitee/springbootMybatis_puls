package com.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("f_collect")
public class FCollect {
    /**
     * 收藏表（f_collect）
     */
    @TableId
    private Integer id;

    /**
     * 外键用户表
     */
    private Integer fUser;

    /**
     * 外键商品表
     */
    private Integer book;

    /**
     * 添加时间
     */
    private Date time;
}

