package com.qy.service.house;

import com.qy.domain.dto.ContractDto;
import com.qy.domain.vo.ContractVo;

import java.util.List;

public interface MyContractService {
    List<ContractVo> getContractByTenantId(Integer userId);

    List<ContractVo> getContractByLandordId(Integer userId);

    void updateContract(ContractDto contractDto);
}
