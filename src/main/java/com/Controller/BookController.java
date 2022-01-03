package com.Controller;

import com.dao.BookMapper;
import com.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("Book")
public class BookController {
    @Resource
    BookMapper mapper;

    @RequestMapping("sel")
    public Object sel(String type, String brand, String state) {
        System.out.println(type+"===="+brand+"====="+state);
        return mapper.getBook(type, brand, state);
    }

    @RequestMapping("ins")
    public Object ins(Book book) {
        System.out.println(book);
        return mapper.insert(book);
    }

    @RequestMapping("updState")
    public Object upd(Integer id) {
        return mapper.updateState(id);
    }

    @RequestMapping("updStateTwo")
    public Object updTwo(Integer id) {
        return mapper.updateStateTwo(id);
    }

    @RequestMapping("updateImport")
    public Object updateImport(Book book) {
        return mapper.updateById(book);
    }

    @RequestMapping("del")
    public Object del(Integer id) {
        return mapper.deleteById(id);
    }
}
