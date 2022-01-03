package com.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dao.FUserMapper;
import com.entity.FUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("FUser")
public class FUserController {
    @Resource
    FUserMapper mapper;

    /**
     * 使用手机号和密码登录页面
     *
     * @param phone
     * @param password
     * @return
     */
    @RequestMapping("sel")
    public Object sel(String phone, String password) {
        QueryWrapper<FUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone", phone).eq("password", password);
        return   mapper.selectList(queryWrapper);
    }

    /**
     * 修改密码
     * 修改用自己的Mapper.xml
     *
     * @param id
     * @param password
     * @return
     */
    @RequestMapping("upd")
    public Object upd(Integer id, String password) {
        return mapper.updatePassword(id, password);
    }

    /**
     * 修改个人信息解析：
     * 只能让用户修改自己权益之内的
     * 可更改字段 id name  phone mail idnumber
     *
     * @param fUser
     * @return
     */
    @RequestMapping("updPersonal_info")
    public Object updPersonal(FUser fUser) {
        return mapper.updPersonal_info(fUser);
    }

    /**
     * 换绑手机号
     *
     * @param id
     * @param Phone
     * @return
     */

    @RequestMapping("bindPhone")
    public Object bindPhone(Integer id, String Phone) {
        return mapper.bindPhone(id, Phone);
    }

    /**
     * 带条件分页查询（用户名，职位，状态）
     */
    @RequestMapping("getFuserLimit")
    public Object getFuserLimit(String name, String state, Integer pagecode, Integer pagesize) {
        return mapper.getFUserLimit(name, state, pagecode, pagesize);
    }

    /**
     * 启用
     */
    @RequestMapping("updateStart")
    public Object updateStart(Integer id) {
        return mapper.updateStart(id);
    }

    /**
     * 禁用
     */
    @RequestMapping("updateState")
    public Object updateState(Integer id) {
        return mapper.updateState(id);
    }
}
