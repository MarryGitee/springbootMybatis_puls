package com.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName
public class Role {
    /**
     * 职位表
     */
    @TableId
    private Integer rid;

    /**
     * 职位名称
     */
    private String rname;

    /**
     * 备注
     */
    private String annotation;

    /**
     * 状态
     */
    private String state;
}

