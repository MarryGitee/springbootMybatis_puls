package com.Security;

import com.dao.userMapper;
import com.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class UserDetailsConfig implements UserDetailsService {
    @Resource
    userMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        List<User> userLoging = mapper.getUserLoging(s);
        System.out.println("用户信息：" + userLoging.toString());
        System.out.println("返回count长度:"+userLoging.size());
        if (userLoging.size() == 1) {
            return userLoging.get(0);
        } else {
            throw new UsernameNotFoundException("找不到该用户");
        }
    }
}
