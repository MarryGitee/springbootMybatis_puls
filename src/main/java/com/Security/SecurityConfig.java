package com.Security;

import com.Hander.AccessDeniedHandlerConfig;
import com.Hander.authenticationEntryPointConfig;
import com.Hander.failureHandler;
import com.Hander.successHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsUtils;

import javax.annotation.Resource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Resource
    successHandler successHandler;
    @Resource
    failureHandler failureHandler;
    @Resource
    AccessDeniedHandlerConfig accessDeniedHandlerConfig;
    @Resource
    authenticationEntryPointConfig authenticationEntryPointConfig;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.cors()
              .and()
              .csrf()
              .disable()
              .authorizeRequests()
              .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
              .and().formLogin()
                .loginPage("/login")
                .usernameParameter("uname")
                .passwordParameter("pwd")
                .successHandler(successHandler)
                .failureHandler(failureHandler)
                .permitAll()
                .and()
                .authorizeRequests()
                .anyRequest()
                .access("@RBACConfig.hasAuthority(authentication,request)")
                .and()
                .exceptionHandling()
                .accessDeniedHandler(accessDeniedHandlerConfig)  // 认证成功，权限不足，访问被拒绝
                .authenticationEntryPoint(authenticationEntryPointConfig) // 访问被拒绝：未认证
                .and()
                .logout()
                .permitAll()
                .and()
                .csrf()
                .disable();
    }
    @Bean
    public BCryptPasswordEncoder  PasswordEncoder(){
        return   new BCryptPasswordEncoder();
    }
    @Resource
    UserDetailsConfig userDetailsConfig;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("进入判断！！！");
        auth.userDetailsService(userDetailsConfig).passwordEncoder(PasswordEncoder());
    }

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123456"));
    }
}
