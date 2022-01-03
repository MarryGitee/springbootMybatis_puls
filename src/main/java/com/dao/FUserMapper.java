package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.FUser;
import com.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface FUserMapper extends BaseMapper<FUser> {
    /**
     * 修改用户密码
     *
     * @param id
     * @param password
     * @return
     */
    Integer updatePassword(Integer id, String password);

    /**
     * 修改用户信息
     *
     * @param fUser
     * @return
     */
    Integer updPersonal_info(@Param("fUser") FUser fUser);

    /**
     * 换绑手机号
     *
     * @param id
     * @param Phone
     * @return
     */
    Integer bindPhone(Integer id, String Phone);

    /**
     * f_user
     * 带条件分页查询（用户名，职位，状态）
     * 启用
     * 禁用
     */

    List<FUser> getFUserLimit(@Param("uname") String uname,
                              @Param("state") String state,
                              @Param("pageCode") Integer pageCode,
                              @Param("pageSize") Integer pageSize);

    @Update("update mall.f_user set   state=1  where id=#{id} ")
    Integer updateState(@Param("id") Integer id);

    @Update("update mall.f_user set state=0 where id = #{id} ")
    Integer updateStart(@Param("id") Integer id);
}
