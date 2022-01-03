package com.Controller;

import com.dao.MenuMapper;
import com.entity.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("Menu")
public class MenuController {
    @Resource
    MenuMapper mapper;

    @RequestMapping("sel")
    public Object sel() {
        List<Menu> typeList = mapper.selectList(null);
        System.out.println(typeList.toString());
        return typeList;
    }

    @RequestMapping("ins")
    public Object ins(Menu menu) {
        return mapper.insert(menu);
    }

    @RequestMapping("delete")
    public Object delete(Integer id) {
        return mapper.deleteById(id);
    }

    @RequestMapping("update")
    public Object update(Menu menu) {
        return mapper.updateById(menu);
    }
}
