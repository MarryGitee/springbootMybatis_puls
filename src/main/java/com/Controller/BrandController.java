package com.Controller;

import com.dao.BrandMapper;
import com.entity.Brand;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@CrossOrigin
@RestController
@RequestMapping("Brand")
public class BrandController {
    @Resource
    BrandMapper mapper;

    @RequestMapping("sel")
    public Object method() {
        return mapper.selectList(null);
    }

    @RequestMapping("ins")
    public Object method2(Brand brand) {
        return mapper.insert(brand);
    }

    @RequestMapping("del")
    public Object method(Integer id) {
        return mapper.deleteById(id);
    }

    @RequestMapping("upd")
    public Object method(Brand brand) {
        return mapper.updateById(brand);
    }
}
