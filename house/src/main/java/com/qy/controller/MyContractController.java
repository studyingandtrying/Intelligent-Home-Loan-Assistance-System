package com.qy.controller;

import com.qy.domain.dto.ContractDto;
import com.qy.domain.vo.ContractVo;
import com.qy.service.house.MyContractService;
import com.qy.utils.BaseContext;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Myhouse/contract")
public class MyContractController {

    @Autowired
    private MyContractService myContractService;

    @GetMapping("/getTenantContract")
    public AjaxResult getTenantContract(){
        List<ContractVo> list=myContractService.getContractByTenantId(BaseContext.getCurrentId());
        return AjaxResult.success("查询成功！",list);
    }
    @GetMapping("/getLandlordContract")
    public AjaxResult getLandlordContract(){
        List<ContractVo> list=myContractService.getContractByLandordId(BaseContext.getCurrentId());
        return AjaxResult.success("查询成功！",list);
    }

    @PutMapping("/draftContract")
    public AjaxResult draftContract(@RequestBody ContractDto contractDto){
        myContractService.addContract(contractDto);
        return AjaxResult.success("插入成功！");
    }


}
