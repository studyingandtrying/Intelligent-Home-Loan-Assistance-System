package com.qy.service.house.impl;

import com.qy.domain.dto.HouseDto;
import com.qy.domain.dto.SearchHouseParam;
import com.qy.domain.pojo.HousePojo;
import com.qy.domain.vo.HouseVo;
import com.qy.mapper.house.MyHouseMapper;
import com.qy.service.house.MyHouseService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyHouseServiceImpl implements MyHouseService {

    @Autowired
    private MyHouseMapper houseMapper;
    @Override
    public List<HouseVo> searchHouse(SearchHouseParam searchHouseParam) {
        searchHouseParam.setOffSet((searchHouseParam.getPageNum()-1)*searchHouseParam.getPageSize());
        return houseMapper.searchHouse(searchHouseParam).stream().map(housePojo -> HouseVo.builder()
                .id(housePojo.getId())
                .title(housePojo.getTitle())
                .rent(housePojo.getRent())
                .deposit(housePojo.getDeposit())
                .description(housePojo.getDescription())
                .district(housePojo.getDistrict())
                .address(housePojo.getAddress())
                .facillities(housePojo.getFacillities())
                .images(housePojo.getImages())
                .landlordId(housePojo.getLandlordId())
                .rooms(housePojo.getRooms())
                .status(housePojo.getStatus())
                .type(housePojo.getType())
                .viewCount(housePojo.getViewCount())
                .contact(housePojo.getContact())
                .area(housePojo.getArea())
                .build()
        ).toList();
    }

    @Override
    public HouseVo getHouseById(Integer id) {
        HousePojo housePojo=houseMapper.selectHouseById(id);
        return HouseVo.builder()
                .id(housePojo.getId())
                .title(housePojo.getTitle())
                .rent(housePojo.getRent())
                .deposit(housePojo.getDeposit())
                .description(housePojo.getDescription())
                .district(housePojo.getDistrict())
                .address(housePojo.getAddress())
                .facillities(housePojo.getFacillities())
                .images(housePojo.getImages())
                .landlordId(housePojo.getLandlordId())
                .rooms(housePojo.getRooms())
                .status(housePojo.getStatus())
                .type(housePojo.getType())
                .viewCount(housePojo.getViewCount())
                .contact(housePojo.getContact())
                .area(housePojo.getArea())
                .build();
    }

    @Override
    public void addHouse(HouseDto houseDto) {
        houseMapper.insertHousePojo(HousePojo.builder()
                .title(houseDto.getTitle())
                .rent(houseDto.getRent())
                .deposit(houseDto.getDeposit())
                .description(houseDto.getDescription())
                .district(houseDto.getDistrict())
                .address(houseDto.getAddress())
                .facillities(houseDto.getFacillities())
                .images(houseDto.getImages())
                .landlordId(houseDto.getLandlordId())
                .rooms(houseDto.getRooms())
                .status(houseDto.getStatus())
                .type(houseDto.getType())
                .viewCount(houseDto.getViewCount())
                .contact(houseDto.getContact())
                .area(houseDto.getArea())
                .build());
    }

    @Override
    public void updateHouse(HouseDto houseDto) {
        houseMapper.updateHousePojo(HousePojo.builder()
                .id(houseDto.getId())
                .title(houseDto.getTitle())
                .rent(houseDto.getRent())
                .deposit(houseDto.getDeposit())
                .description(houseDto.getDescription())
                .district(houseDto.getDistrict())
                .address(houseDto.getAddress())
                .facillities(houseDto.getFacillities())
                .images(houseDto.getImages())
                .landlordId(houseDto.getLandlordId())
                .rooms(houseDto.getRooms())
                .status(houseDto.getStatus())
                .type(houseDto.getType())
                .viewCount(houseDto.getViewCount())
                .contact(houseDto.getContact())
                .area(houseDto.getArea())
                .build());
    }

    @Override
    public AjaxResult deleteHouse(HouseDto houseDto) {
        Integer result=houseMapper.deleteHouseById(houseDto.getId());
        if(result==0){
            return AjaxResult.success("该房源不存在！");
        }else{
            return AjaxResult.success("删除成功！");
        }
    }


}