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
@TableName
public class Book {
    /**
     * 图书信息表
     */
    @TableId
    private Integer id;

    /**
     * 图书名称
     */
    private String name;

    /**
     * 外键图书类型
     */
    private String type;

    /**
     * 外键材质表
     */
    private String texture;

    /**
     * 外键出版社
     */
    private String publisher;

    /**
     * 外键品牌
     */
    private String brand;

    /**
     * 外键作者
     */
    private String author;

    /**
     * 出版时间
     */
    private String date;

    /**
     * 价格
     */
    private Double price;

    /**
     * 封面图
     */
    private String head;

    /**
     * 图书简介
     */
    private String brief;

    /**
     * 图书详情
     */
    private String detail;

    /**
     * 状态
     */
    private Integer state;
}

