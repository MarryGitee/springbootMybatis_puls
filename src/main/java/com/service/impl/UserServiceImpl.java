package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.userMapper;;
import com.entity.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl extends ServiceImpl<userMapper, User> implements UserService {
    @Resource
    userMapper mapper;

    @Override
    public List<User> getUserLimit(String uname, String rname, String state, Integer pageCode, Integer pageSize) {
        System.out.println(pageCode+","+pageSize);
        return mapper.getUserLimit(uname, rname, state, (pageCode-1)*pageSize, pageSize);
    }
}
