package com.Hander;

import com.entity.Menu;
import com.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class RBACConfig {

    public boolean hasAuthority(Authentication authentication, HttpServletRequest request) {
        System.out.println("=========鉴权=========");
//        判断是否认证  我们可以强制转换为我们的User对象
        User user = null;
        Object principal = authentication.getPrincipal();
        System.out.println("传过来的的对象："+principal);
        if (principal instanceof String && principal.toString().equals("anonymousUser")) {
            System.out.println("没有认证！！！");
            return false;
        } else {
            user =(User) authentication.getPrincipal();
            /**
             * 1.请求路径
             *
             * 2.角色权限+请求路径
             */
            for (Menu menu : user.getMenus()) {
                System.out.println(menu.getUrl());
            }
            String uri = request.getRequestURI();
            System.out.println(" URL: " + uri);
            return true;
        }
    }

}
