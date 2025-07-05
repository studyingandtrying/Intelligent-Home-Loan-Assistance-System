package com.qy.service.house.impl;


import com.qy.constance.ContractConstance;
import com.qy.domain.dto.ContractDto;
import com.qy.domain.pojo.ContractPojo;
import com.qy.domain.vo.ContractVo;
import com.qy.mapper.house.MyContractMapper;
import com.qy.service.house.MyContractService;
import com.qy.utils.BaseContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyContractServiceImpl implements MyContractService {
    @Autowired
    private MyContractMapper myContractMapper;
    @Override
    public List<ContractVo> getContractByTenantId(Integer userId) {
        List<ContractPojo> contracts= myContractMapper.selectContractsByTenantId(userId);
        List<ContractVo> list = contracts.stream().map(contractPojo -> ContractVo.builder().build()).toList();
        return list;

    }

    @Override
    public List<ContractVo> getContractByLandordId(Integer userId) {
        List<ContractPojo> contracts= myContractMapper.selectContractsByLandordId(userId);
        List<ContractVo> list = contracts.stream().map(contractPojo -> ContractVo.builder().build()).toList();
        return list;
    }

    @Override
    public void addContract(ContractDto contractDto) {
        myContractMapper.insertContract(ContractPojo.builder()
                        .startDate(contractDto.getStartDate())
                        .endDate(contractDto.getEndDate())
                .houseId(contractDto.getHouseId())
                .tenantId(contractDto.getTenantId())
                //房东发起合同
                .landlordId(BaseContext.getCurrentId())
                .rentAmount(contractDto.getRentAmount())
                .depositAmount(contractDto.getDepositAmount())
                //草稿阶段
                .status(ContractConstance.status.DRAFT.getValue())
                .build());
    }
}
