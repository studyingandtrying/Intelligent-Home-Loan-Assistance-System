package com.qy.service.house;

import com.qy.domain.dto.HouseDto;
import com.qy.domain.dto.SearchHouseParam;
import com.qy.domain.vo.HouseVo;
import com.ruoyi.common.core.domain.AjaxResult;

import java.util.List;

public interface MyHouseService {
    List<HouseVo> searchHouse(SearchHouseParam searchHouseParam);

    HouseVo getHouseById(Integer id);

    void addHouse(HouseDto houseDto);

    void updateHouse(HouseDto houseDto);

    AjaxResult deleteHouse(HouseDto houseDto);
}
