package com.Controller;

import com.dao.userMapper;
import com.entity.User;
import com.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("User")
public class UserController {
    @Resource
    userMapper mapper;
    @Resource
    UserServiceImpl service;

    /**
     * 修改密码根据id
     *
     * @param id
     * @param password
     * @return
     */
    @RequestMapping("updPassword")
    public Object updPassword(Integer id, String password) {
        return mapper.updPassword(id, password);
    }

    /**
     * 修改个人信息
     *
     * @param user
     * @return
     */
    @RequestMapping("updInfo")
    public Object updInfo(User user) {
        return mapper.updInfo(user);
    }

    /**
     * 切换角色id根据用户id
     *
     * @param uid
     * @param rid
     * @return
     */
    @RequestMapping("updateRole")
    public Object updateRole(Integer uid, Integer rid) {
        return mapper.updateRole(uid, rid);
    }

    /**
     * 修改职位
     *
     * @param rid
     * @param rname
     * @return
     */
    public Object updateName(Integer rid, String rname) {
        return mapper.updateName(rid, rname);
    }

    /**
     * 带条件分页查询（用户名，职位，状态）
     *
     * @param uname
     * @param rname
     * @param state
     * @return
     */
    @RequestMapping("getUserLimit")
    public Object getUserLimit(Integer pageNum, Integer pageSize, String uname, String rname, String state, Integer pagecode, Integer pagesize) {
        return service.getUserLimit(uname, rname, state, pageNum, pageSize);
    }
}
