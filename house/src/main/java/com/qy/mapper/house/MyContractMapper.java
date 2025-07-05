package com.qy.mapper.house;

import com.qy.domain.pojo.ContractPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MyContractMapper {
    Integer insertContract(ContractPojo contractPojo);

    List<ContractPojo> selectContractsByTenantId(@Param("userId") Integer userId);

    List<ContractPojo> selectContractsByLandordId(@Param("userId")Integer userId);


}
