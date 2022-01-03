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
public class Texture {
    /**
     * 图书材质表
     */
    @TableId
    private Integer id;

    /**
     * 材质名称
     */
    private String name;
}

