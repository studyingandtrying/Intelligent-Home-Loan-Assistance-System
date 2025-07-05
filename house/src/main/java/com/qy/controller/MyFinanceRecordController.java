package com.qy.controller;

import com.qy.domain.vo.FinanceRecordVo;
import com.qy.service.house.MyFinanceRecordService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Myhouse/finance")
public class MyFinanceRecordController {

    @Autowired
    private MyFinanceRecordService myFinanceRecordService;



    @GetMapping("/getMyFinanceRecord")
    public AjaxResult getMyFinanceRecord(){
        List<FinanceRecordVo> financeRecordVos=myFinanceRecordService.getMyFinanceRecord();
        return AjaxResult.success("查询成功",financeRecordVos);
    }
}
