package com.Controller;

import com.dao.FOrderMapper;
import com.entity.FOrder;
import com.service.impl.FOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("FOrder")
public class FOrderController {
    @Resource
    FOrderMapper mapper;
    @Resource
    FOrderServiceImpl service;
    @RequestMapping("sel")
    public Object sel(String userID,Integer pagecode,Integer pagesize) {
        System.out.println(pagecode+"============="+pagesize);
        List<FOrder> forder = service.getForder(userID, pagecode, pagesize);
        System.out.println(forder.toString());
        return  forder;
    }

    @RequestMapping("ins")
    public Object ins(FOrder fOrder) {
        return mapper.SetOrder(fOrder);
    }

    @RequestMapping("del")
    public Object del(Integer id) {
        return mapper.dropOrder(id);
    }

    @RequestMapping("updateorderTrue")
    public Object updateorderTrue(Integer id) {
        return mapper.updateorderTrue(id);
    }

    @RequestMapping("updateorderSet")
    public Object updateorderSet(Integer id) {
        return mapper.updateorderSet(id);
    }
}
