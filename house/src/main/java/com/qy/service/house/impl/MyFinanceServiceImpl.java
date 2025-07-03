package com.qy.service.house.impl;

import com.qy.domain.vo.FinanceRecordVo;
import com.qy.mapper.house.MyFinanceRecordMapper;
import com.qy.service.house.MyFinanceRecordService;
import com.qy.utils.BaseContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyFinanceServiceImpl implements MyFinanceRecordService {

    @Autowired
    private MyFinanceRecordMapper myFinanceRecordMapper;


    @Override
    public List<FinanceRecordVo> getMyFinanceRecord() {
        return myFinanceRecordMapper.selectMyFinanceRecord(BaseContext.getCurrentId()).stream().map(pojo->FinanceRecordVo.builder()
                .type(pojo.getType())
                .description(pojo.getDescription())
                .relatedHouseId(pojo.getRelatedHouseId())
                .relatedContractId(pojo.getRelatedContractId())
                .createdAt(pojo.getCreatedAt())
                .amount(pojo.getAmount())
                .id(pojo.getId())
                .build()).toList();
    }
}
