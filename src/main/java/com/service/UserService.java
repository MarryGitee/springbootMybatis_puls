package com.service;

import com.entity.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;
public interface UserService {

    List<User> getUserLimit(@Param("uname") String uname, @Param("rname") String rname, @Param("state") String state, @Param("pageCode") Integer pageCode, @Param("pageSize") Integer pageSize);
}
