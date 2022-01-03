package com.Controller;

import com.dao.FSiteMapper;
import com.dao.TextureMapper;
import com.entity.FSite;
import com.entity.Texture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("FSite")
public class FSiteController {
    @Resource
    FSiteMapper mapper;

    @RequestMapping("sel")
    public Object sel() {
        List<FSite> typeList = mapper.selectList(null);
        System.out.println(typeList.toString());
        return typeList;
    }

    @RequestMapping("ins")
    public Object ins(FSite fSite) {
        return mapper.insert(fSite);
    }

    @RequestMapping("delete")
    public Object delete(Integer id) {
        return mapper.deleteById(id);
    }

    @RequestMapping("update")
    public Object update(FSite fSite) {
        return mapper.updateById(fSite);
    }
}
