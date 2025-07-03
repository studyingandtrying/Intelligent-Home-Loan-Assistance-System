package com.qy.service.house.impl;

import com.qy.domain.dto.UserDto;
import com.qy.domain.pojo.UserPojo;
import com.qy.mapper.house.MyUserMapper;
import com.qy.service.house.MyUserService;
import com.qy.utils.JwtUtil;
import com.qy.utils.PasswordEncoder;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.redis.RedisCache;
import com.ruoyi.common.utils.uuid.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserServiceImpl implements MyUserService {

    @Autowired
    private RedisCache redisCache;

    @Autowired
    private MyUserMapper userMapper;
    @Override
    public AjaxResult login(UserDto userDto) {
        List<UserPojo> userPojos = userMapper.selectUserByUserName(userDto.getUsername());
        if (!userPojos.isEmpty()){
            if(PasswordEncoder.check(userDto.getPassword(),userPojos.get(0).getPassword())){
                Integer id=userPojos.get(0).getId();
                String token= JwtUtil.createJWT(UUID.randomUUID().toString(), String.valueOf(id));
                String redisKey="token:"+id;
                redisCache.setCacheObject(redisKey,id);
                return AjaxResult.success("登陆成功！",token);
            }else{
                return AjaxResult.success("用户名或密码错误！");
            }
        }else{
            return AjaxResult.success("用户名不存在！");
        }
    }

    @Override
    public AjaxResult register(UserDto userDto) {
        List<UserPojo> userPojos = userMapper.selectUserByUserName(userDto.getUsername());
        if (userPojos.isEmpty()){
            userMapper.insertUserByUserPojo(UserPojo.builder()
                            .username(userDto.getUsername())
                            .password(PasswordEncoder.encode(userDto.getPassword()))
                            .role(userDto.getRole())
                    .build());
            return AjaxResult.success("注册成功！");
        }else{
            return AjaxResult.success("用户名已存在！");
        }
    }
}
