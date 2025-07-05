package com.qy.admin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.admin.mapper.HousesMapper;
import com.qy.admin.domain.Houses;
import com.qy.admin.service.IHousesService;

/**
 * 房源：存储房东发布的房屋信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
@Service
public class HousesServiceImpl implements IHousesService 
{
    @Autowired
    private HousesMapper housesMapper;

    /**
     * 查询房源：存储房东发布的房屋信息
     * 
     * @param id 房源：存储房东发布的房屋信息主键
     * @return 房源：存储房东发布的房屋信息
     */
    @Override
    public Houses selectHousesById(Long id)
    {
        return housesMapper.selectHousesById(id);
    }

    /**
     * 查询房源：存储房东发布的房屋信息列表
     * 
     * @param houses 房源：存储房东发布的房屋信息
     * @return 房源：存储房东发布的房屋信息
     */
    @Override
    public List<Houses> selectHousesList(Houses houses)
    {
        return housesMapper.selectHousesList(houses);
    }

    /**
     * 新增房源：存储房东发布的房屋信息
     * 
     * @param houses 房源：存储房东发布的房屋信息
     * @return 结果
     */
    @Override
    public int insertHouses(Houses houses)
    {
        return housesMapper.insertHouses(houses);
    }

    /**
     * 修改房源：存储房东发布的房屋信息
     * 
     * @param houses 房源：存储房东发布的房屋信息
     * @return 结果
     */
    @Override
    public int updateHouses(Houses houses)
    {
        return housesMapper.updateHouses(houses);
    }

    /**
     * 批量删除房源：存储房东发布的房屋信息
     * 
     * @param ids 需要删除的房源：存储房东发布的房屋信息主键
     * @return 结果
     */
    @Override
    public int deleteHousesByIds(Long[] ids)
    {
        return housesMapper.deleteHousesByIds(ids);
    }

    /**
     * 删除房源：存储房东发布的房屋信息信息
     * 
     * @param id 房源：存储房东发布的房屋信息主键
     * @return 结果
     */
    @Override
    public int deleteHousesById(Long id)
    {
        return housesMapper.deleteHousesById(id);
    }
}
