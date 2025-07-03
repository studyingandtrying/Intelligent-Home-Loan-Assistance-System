package com.qy.service.house;

import com.qy.domain.dto.AppointMentDto;
import com.qy.domain.vo.AppointMentVo;
import com.ruoyi.common.core.domain.AjaxResult;

import java.util.List;

public interface MyAppointService {
    AjaxResult appointHouse(AppointMentDto appointMentDto);

    void updateStatus(AppointMentDto appointMentDto);

    List<AppointMentVo> getAppointMentByLandlordId(Integer currentId);
}
