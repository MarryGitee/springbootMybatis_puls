package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.Role;
import com.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface userMapper  extends BaseMapper<User> {
    /**
     * 登录我们需要权限
     *
     * @param name
     * @return
     */
    List<User> getUserLoging(String name);

    /**
     * 修改密码
     */
    @Update("update mall.user set password=#{password} where uid=#{id}")
    Integer updPassword(Integer id, String password);

    /**
     * 修改用户个人信息
     *
     * @param user
     * @return
     */
    Integer updInfo(User user);

    /**
     * 切换角色id
     *
     * @param id
     * @return
     */
    @Update("update mall.user set rid  = #{rid} where uid=#{id}")
    Integer updateRole(@Param("id") Integer id, @Param("rid") Integer rid);

    /**
     * 修改职位
     * @param rid
     * @param rname
     * @return
     */
    @Update("update mall.role set rname=#{rname}  where rid=#{rid}")
    Integer updateName(@Param("rid") Integer rid, @Param("rname") String rname);

    /**
     * 带条件分页查询（用户名，职位，状态）
     * @param uname
     * @param rname
     * @param state
     * @return
     */
    List<User> getUserLimit(@Param("uname") String uname,@Param("rname") String rname,@Param("state") String state,@Param("pageCode")Integer pageCode,@Param("pageSize") Integer pageSize);
}
