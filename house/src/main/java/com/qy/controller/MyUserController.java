package com.qy.controller;

import com.qy.domain.dto.UserDto;
import com.qy.service.house.MyUserService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/house/user")
public class MyUserController {

    @Autowired
    private MyUserService userService;
    @PostMapping("/login")
    public AjaxResult login(@RequestBody UserDto userDto){
        return userService.login(userDto);
    }

    @PostMapping("/register")
    public AjaxResult register(@RequestBody UserDto userDto){
        return userService.register(userDto);
    }


}
