package com.li.student.config;

import com.li.student.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author li
 * @create 2022-05-10-16:12
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")     //拦截所有请求包括静态资源
                .excludePathPatterns("/","/tologin","/login","/toregister","/register","/css/**","/img/**","/js/**");    //放行请求

    }
}
