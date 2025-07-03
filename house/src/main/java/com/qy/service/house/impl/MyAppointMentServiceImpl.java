package com.qy.service.house.impl;

import com.qy.constance.AppointmentConstance;
import com.qy.constance.HouseConstance;
import com.qy.domain.dto.AppointMentDto;
import com.qy.domain.pojo.AppointMentPojo;
import com.qy.domain.pojo.HousePojo;
import com.qy.domain.vo.AppointMentVo;
import com.qy.mapper.house.MyAppointMentMapper;
import com.qy.mapper.house.MyHouseMapper;
import com.qy.service.house.MyAppointService;
import com.qy.utils.BaseContext;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyAppointMentServiceImpl implements MyAppointService {

    @Autowired
    private MyHouseMapper myHouseMapper;
    @Autowired
    private MyAppointMentMapper myAppointMentMapper;
    @Override
    public AjaxResult appointHouse(AppointMentDto appointMentDto) {
        HousePojo housePojo = myHouseMapper.selectHouseById(appointMentDto.getHouseId());
        if(!housePojo.getStatus().equals(HouseConstance.HouseStatus.ACTIVE.getValue())){
            return AjaxResult.success("该房源不可操作！");
        }else{
            appointMentDto.setTenantId(BaseContext.getCurrentId());
            appointMentDto.setLandlordId(housePojo.getLandlordId());
            myAppointMentMapper.insertAppointMent(AppointMentPojo.builder()
                            .appointmentTime(appointMentDto.getAppointmentTime())
                            .houseId(appointMentDto.getHouseId())
                            .contactName(appointMentDto.getContactName())
                            .contactPhone(appointMentDto.getContactPhone())
                            .status(AppointmentConstance.status.PENDING.getValue())
                            .remark(appointMentDto.getRemark())
                            .landlordId(appointMentDto.getLandlordId())
                            .tenantId(appointMentDto.getTenantId())
                    .build());
            return AjaxResult.success("预约成功！");
        }
    }

    @Override
    public void updateStatus(AppointMentDto appointMentDto) {
        myAppointMentMapper.updateStatus(AppointMentPojo.builder()
                        .id(appointMentDto.getId())
                        .status(appointMentDto.getStatus())
                .build());
    }

    @Override
    public List<AppointMentVo> getAppointMentByLandlordId(Integer userId) {
        return myAppointMentMapper.selectAppointMentByLandLordId(userId).stream().map(pojo->AppointMentVo.builder()
                .id(pojo.getId())
                .rejectReason(pojo.getRejectReason())
                .landlordId(pojo.getLandlordId())
                .remark(pojo.getRemark())
                .houseId(pojo.getHouseId())
                .tenantId(pojo.getTenantId())
                .status(pojo.getStatus())
                .contactPhone(pojo.getContactPhone())
                .appointmentTime(pojo.getAppointmentTime())
                .contactName(pojo.getContactName())
                .build()).toList();
    }
}
