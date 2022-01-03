package com.Controller;

import com.dao.TypeMapper;
import com.entity.Type;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("Type")
public class TypeController {
    @Resource
    TypeMapper mapper;

    @RequestMapping("sel")
    public Object sel() {
        List<Type> typeList = mapper.selectList(null);
        System.out.println(typeList.toString());
        return typeList;
    }

    @RequestMapping("ins")
    public Object ins(Type type) {
       return mapper.insert(type);
    }

    @RequestMapping("delete")
    public Object delete(Integer id) {
        return mapper.deleteById(id);
    }

    @RequestMapping("update")
    public Object update(Type type) {
        return mapper.updateById(type);
    }
}
