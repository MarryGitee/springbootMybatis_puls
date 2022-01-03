package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.FUserMapper;
import com.entity.FUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FUserServiceImpl extends ServiceImpl<FUserMapper, FUser> {
    @Resource
    FUserMapper mapper;
}
