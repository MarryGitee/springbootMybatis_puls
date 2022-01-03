package com.Controller;

import com.dao.AuthorMapper;
import com.entity.Author;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("Author")
public class AuthorController {
    @Resource
    AuthorMapper mapper;

    @RequestMapping("sel")
    public Object method() {
        return mapper.selectList(null);
    }

    @RequestMapping("ins")
    public Object method2(Author author) {
        return mapper.insert(author);
    }

    @RequestMapping("del")
    public Object method3(Integer id) {
        return mapper.deleteById(id);
    }

    @RequestMapping("upd")
    public Object method(Author author) {
        return mapper.updateById(author);
    }
}
