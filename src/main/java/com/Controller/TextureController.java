package com.Controller;

import com.dao.TextureMapper;
import com.entity.Texture;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("Texture")
public class TextureController {
    @Resource
    TextureMapper mapper;

    @RequestMapping("sel")
    public Object sel() {
        List<Texture> typeList = mapper.selectList(null);
        System.out.println(typeList.toString());
        return typeList;
    }

    @RequestMapping("ins")
    public Object ins(Texture texture) {
        return mapper.insert(texture);
    }

    @RequestMapping("delete")
    public Object delete(Integer id) {
        return mapper.deleteById(id);
    }

    @RequestMapping("update")
    public Object update(Texture texture) {
        return mapper.updateById(texture);
    }
}
