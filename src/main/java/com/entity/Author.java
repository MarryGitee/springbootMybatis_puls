package com.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName
public class Author {
    /**
     * 作者表
     */
    @TableId
    private Integer id;

    /**
     * 作者名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 照片
     */
    private String head;

    /**
     * 代表作品
     */
    private String magnum;

    /**
     * 国家
     */
    private String abj;

    /**
     * 简介
     */
    private String brief;
}

