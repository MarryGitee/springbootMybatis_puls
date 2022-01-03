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
public class Brand {
    /**
     * 图书品牌表
     */
    @TableId
    private Integer id;

    /**
     * 品牌名字
     */
    private String name;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 品牌发源地
     */
    private String headstream;

    /**
     * 联系电话
     */
    private String contact;

    /**
     * 负责人
     */
    private String the;
}

