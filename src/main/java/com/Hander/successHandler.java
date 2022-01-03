package com.Hander;

import com.alibaba.fastjson.JSON;
import com.util.dataMsg;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class successHandler  implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        httpServletResponse.setContentType("text/html;charset=utf-8");
        System.out.println("认证成功！");
        Object principal = authentication.getPrincipal();
        System.out.println("principal:"+principal);
        PrintWriter writer = httpServletResponse.getWriter();
        writer.print(JSON.toJSON(dataMsg.setMsg(principal)));
        writer.flush();
        writer.close();
    }
}
