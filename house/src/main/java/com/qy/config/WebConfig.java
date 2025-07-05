package com.qy.config;

import com.qy.interceptor.MyLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private MyLoginInterceptor myLoginInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(myLoginInterceptor)
                .addPathPatterns(("/Myhouse/**"))
                .excludePathPatterns("/Myhouse/user/login","/house/user/register");
    }
}
