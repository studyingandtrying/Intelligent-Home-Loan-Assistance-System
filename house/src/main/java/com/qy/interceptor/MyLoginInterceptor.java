package com.qy.interceptor;

import com.qy.utils.BaseContext;
import com.qy.utils.JwtUtil;
import com.ruoyi.common.core.redis.RedisCache;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyLoginInterceptor implements HandlerInterceptor {
    @Autowired
    private RedisCache redisCache;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
            return true;
        }

        String token = request.getHeader("token");
        if (!StringUtils.hasText(token)) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }
        Integer id;
        try {
            Claims claims= JwtUtil.parseJWT(token);
            id= Integer.valueOf(claims.getSubject());
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }
        String redisKey="token:"+id;
        if (redisCache.getCacheObject(redisKey)==null) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }
        BaseContext.setCurrentId(id);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        BaseContext.removeCurrentId();
    }
}
