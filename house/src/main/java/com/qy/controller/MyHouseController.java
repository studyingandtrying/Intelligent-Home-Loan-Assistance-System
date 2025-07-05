package com.qy.controller;

import com.qy.domain.dto.HouseDto;
import com.qy.domain.dto.SearchHouseParam;
import com.qy.domain.vo.HouseVo;
import com.qy.service.house.MyHouseService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Myhouse/house")
public class MyHouseController {

    @Autowired
    private MyHouseService myHouseService;
    @GetMapping("/searchHouse")
    public AjaxResult getAllHouse(@RequestBody SearchHouseParam searchHouseParam){
        List<HouseVo> houseList=myHouseService.searchHouse(searchHouseParam);
        return AjaxResult.success("获取成功！",houseList);
    }

    @GetMapping("/getHouseById/{id}")
    public AjaxResult getHouseDetail(@PathVariable("id") Integer id){
        HouseVo houseVo=myHouseService.getHouseById(id);
        return AjaxResult.success("详情如下：",houseVo);
    }

    @PostMapping("/add")
    public AjaxResult addHouse(@RequestBody HouseDto houseDto){
        myHouseService.addHouse(houseDto);
        return AjaxResult.success("添加房源成功！");
    }

    @PutMapping("/update")
    public AjaxResult putHouse(@RequestBody HouseDto houseDto){
        myHouseService.updateHouse(houseDto);
        return AjaxResult.success("更新成功！");
    }

    @DeleteMapping("/delete")
    public AjaxResult deleteHouse(@RequestBody HouseDto houseDto){
        return myHouseService.deleteHouse(houseDto);

    }
}
