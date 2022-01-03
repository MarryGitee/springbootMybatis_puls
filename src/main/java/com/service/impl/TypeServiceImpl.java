package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.TypeMapper;
import com.entity.Type;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> {
@Resource
    TypeMapper mapper;
}
