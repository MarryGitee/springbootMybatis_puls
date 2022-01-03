package com.Controller;

import com.dao.FCartMapper;
import com.dao.TextureMapper;
import com.entity.FCart;
import com.entity.Texture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("FCart")
public class FCartController {
    @Resource
    FCartMapper mapper;

    @RequestMapping("sel")
    public Object sel() {
        List<FCart> typeList = mapper.selectList(null);
        System.out.println(typeList.toString());
        return typeList;
    }

    @RequestMapping("ins")
    public Object ins(FCart fCart) {
        return mapper.insert(fCart);
    }

    @RequestMapping("delete")
    public Object delete(Integer id) {
        return mapper.deleteById(id);
    }

    @RequestMapping("update")
    public Object update(FCart fCart) {
        return mapper.updateById(fCart);
    }
}
