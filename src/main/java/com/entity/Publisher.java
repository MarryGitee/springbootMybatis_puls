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
public class Publisher {
    /**
     * 图书出版社表
     */
    @TableId
    private Integer id;

    /**
     * 出版社名字
     */
    private String name;

    /**
     * 出版社地址
     */
    private String site;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 负责人
     */
    private String the;
}

