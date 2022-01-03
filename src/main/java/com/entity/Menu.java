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
public class Menu {
    /**
     * 菜单表
     */
    @TableId
    private Integer mid;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 子菜单
     */
    private Integer son;

    /**
     * 路径
     */
    private String url;

    /**
     * 状态
     */
    private Integer state;
}

