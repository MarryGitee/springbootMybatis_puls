package com.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-12-22 11:47:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("user")
public class User implements Serializable, UserDetails {
    private static final long serialVersionUID = 332383278996713928L;
    /**
     * 员工表
     */
    @TableId("uid")
    private Integer uid;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 身份证号
     */
    private String idcard;
    /**
     * 地址
     */
    private String site;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 入职时间
     */
    private Date entry;
    /**
     * 离职时间
     */
    private String dimission;
    /**
     * 头像
     */
    private String head;
    /**
     * 账号
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 状态
     */
    private String state;
    /**
     * 外键职位
     */
    private Integer rid;

    /**
     * 权限
     */
    private Collection<? extends GrantedAuthority> authorities;

    /**
     * 请求路径
     */
    List<Menu> menus;

    /**
     * 角色
     */
    Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(String... authorities) {
        List<GrantedAuthority> authorityList = AuthorityUtils.createAuthorityList(authorities);
        this.authorities = authorityList;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    // 获取密码
    @Override
    public String getPassword() {
        return this.password;
    }

    // 获取用户名
    @Override
    public String getUsername() {
        return this.username;
    }

}
