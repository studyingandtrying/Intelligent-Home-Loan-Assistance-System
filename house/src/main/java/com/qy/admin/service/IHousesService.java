package com.qy.admin.service;

import java.util.List;
import com.qy.admin.domain.Houses;

/**
 * 房源：存储房东发布的房屋信息Service接口
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public interface IHousesService 
{
    /**
     * 查询房源：存储房东发布的房屋信息
     * 
     * @param id 房源：存储房东发布的房屋信息主键
     * @return 房源：存储房东发布的房屋信息
     */
    public Houses selectHousesById(Long id);

    /**
     * 查询房源：存储房东发布的房屋信息列表
     * 
     * @param houses 房源：存储房东发布的房屋信息
     * @return 房源：存储房东发布的房屋信息集合
     */
    public List<Houses> selectHousesList(Houses houses);

    /**
     * 新增房源：存储房东发布的房屋信息
     * 
     * @param houses 房源：存储房东发布的房屋信息
     * @return 结果
     */
    public int insertHouses(Houses houses);

    /**
     * 修改房源：存储房东发布的房屋信息
     * 
     * @param houses 房源：存储房东发布的房屋信息
     * @return 结果
     */
    public int updateHouses(Houses houses);

    /**
     * 批量删除房源：存储房东发布的房屋信息
     * 
     * @param ids 需要删除的房源：存储房东发布的房屋信息主键集合
     * @return 结果
     */
    public int deleteHousesByIds(Long[] ids);

    /**
     * 删除房源：存储房东发布的房屋信息信息
     * 
     * @param id 房源：存储房东发布的房屋信息主键
     * @return 结果
     */
    public int deleteHousesById(Long id);
}
