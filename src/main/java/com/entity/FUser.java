package com.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("f_user")
public class FUser {
    /**
     * 前台用户表（f_user）
     */
    @TableId("id")
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 注册手机号
     */
    private String phone;

    /**
     * 注册邮箱号
     */
    private String mail;

    /**
     * 密码
     */
    private String password;

    /**
     * 身份证号
     */
    private String idnumber;

    /**
     *
     */
    private Integer state;
}

