package com.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("type")
public class Type implements Serializable {
    /**
     * 图书类型表
     */
    @TableId("tid")
    private Integer tid;

    /**
     * 类型名称
     */
    private String name;

    /**
     * 类型分级
     */
    private Integer son;

    /**
     * 路径
     */
    private String url;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     */
    private Integer state;
}

