package com.Controller;

import com.dao.PublisherMapper;
import com.entity.Publisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("Publisher")
public class PublisherController {
    @Resource
    PublisherMapper mapper;
    @RequestMapping("sel")
    public   Object  method(){
        return mapper.selectList(null);
    }

    @RequestMapping("ins")
    public   Object  method2(Publisher publisher){
        return mapper.insert(publisher);
    }

    @RequestMapping("del")
    public   Object  method3(Integer  id){
    return  mapper.deleteById(id);
    }

    @RequestMapping("upd")
    public   Object  method4(Publisher publisher){
        return mapper.updateById(publisher);
    }
}
