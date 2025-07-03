package com.qy.mapper.house;

import com.qy.domain.dto.SearchHouseParam;
import com.qy.domain.pojo.HousePojo;
import io.netty.util.AsyncMapping;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MyHouseMapper {
    List<HousePojo> searchHouse(SearchHouseParam searchHouseParam);

    HousePojo selectHouseById(Integer id);

    void insertHousePojo(HousePojo housePojo);

    void updateHousePojo(HousePojo housePojo);

    Integer deleteHouseById(Integer id);
}
