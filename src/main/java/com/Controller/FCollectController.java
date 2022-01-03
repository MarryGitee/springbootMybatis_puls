package com.Controller;

import com.dao.FCollectMapper;
import com.dao.TextureMapper;
import com.entity.FCollect;
import com.entity.Texture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("FCollec")
public class FCollectController {
    @Resource
    FCollectMapper mapper;

    @RequestMapping("sel")
    public Object sel() {
        List<FCollect> typeList = mapper.selectList(null);
        System.out.println(typeList.toString());
        return typeList;
    }

    @RequestMapping("ins")
    public Object ins(FCollect fCollect) {
        return mapper.insert(fCollect);
    }

    @RequestMapping("delete")
    public Object delete(Integer id) {
        return mapper.deleteById(id);
    }

    @RequestMapping("update")
    public Object update(FCollect fCollect) {
        return mapper.updateById(fCollect);
    }
}
