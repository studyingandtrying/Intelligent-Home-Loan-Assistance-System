package com.qy.controller;

import com.qy.domain.dto.AppointMentDto;
import com.qy.domain.vo.AppointMentVo;
import com.qy.service.house.MyAppointService;
import com.qy.utils.BaseContext;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/house/appointment")

public class MyAppointMentController {

    @Autowired
    private MyAppointService myAppointService;

    @PostMapping("/appointHouse/")
    public AjaxResult appointHouse(@RequestBody AppointMentDto appointMentDto){
        return myAppointService.appointHouse(appointMentDto);
    }

    @PostMapping("/changeStatus")
    public AjaxResult changeStatus(@RequestBody AppointMentDto appointMentDto){
        myAppointService.updateStatus(appointMentDto);
        return AjaxResult.success("操作成功！");
    }

    @GetMapping("/getAppointment")
    public AjaxResult getAppointmentByLandlordId(){
        List<AppointMentVo> list= myAppointService.getAppointMentByLandlordId(BaseContext.getCurrentId());
        return AjaxResult.success("获取成功！",list);
    }
}
