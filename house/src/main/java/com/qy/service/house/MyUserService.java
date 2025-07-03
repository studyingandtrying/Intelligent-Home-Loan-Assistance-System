package com.qy.service.house;

import com.qy.domain.dto.UserDto;
import com.ruoyi.common.core.domain.AjaxResult;

public interface MyUserService {
    AjaxResult login(UserDto userDto);

    AjaxResult register(UserDto userDto);
}
