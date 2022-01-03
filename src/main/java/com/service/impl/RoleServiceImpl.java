package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.RoleMapper;
import com.entity.Role;
import com.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl  extends ServiceImpl<RoleMapper, Role> implements RoleService {
}
