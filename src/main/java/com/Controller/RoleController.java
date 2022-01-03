package com.Controller;

import com.dao.RoleMapper;
import com.dao.TextureMapper;
import com.entity.Role;
import com.entity.Texture;
import com.service.RoleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("Role")
public class RoleController {
    @Resource
    RoleMapper mapper;
    @Resource
    RoleService service;

    @RequestMapping("sel")
    public Object sel() {
        List<Role> typeList = mapper.selectList(null);
        System.out.println(typeList.toString());
        return typeList;
    }

    @RequestMapping("ins")
    public Object ins(Role role) {
        return service.saveOrUpdate(role);
    }

    @RequestMapping("delete")
    public Object delete(Integer id) {
        System.out.println(id);
        return mapper.deleteById(id);
    }

    @RequestMapping("update")
    public Object update(Role role) {
        return mapper.updateById(role);
    }
}
