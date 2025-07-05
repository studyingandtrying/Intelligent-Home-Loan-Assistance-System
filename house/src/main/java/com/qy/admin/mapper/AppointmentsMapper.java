package com.qy.admin.mapper;

import java.util.List;
import com.qy.admin.domain.Appointments;

/**
 * 预约：租客预约看房记录Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public interface AppointmentsMapper 
{
    /**
     * 查询预约：租客预约看房记录
     * 
     * @param id 预约：租客预约看房记录主键
     * @return 预约：租客预约看房记录
     */
    public Appointments selectAppointmentsById(Long id);

    /**
     * 查询预约：租客预约看房记录列表
     * 
     * @param appointments 预约：租客预约看房记录
     * @return 预约：租客预约看房记录集合
     */
    public List<Appointments> selectAppointmentsList(Appointments appointments);

    /**
     * 新增预约：租客预约看房记录
     * 
     * @param appointments 预约：租客预约看房记录
     * @return 结果
     */
    public int insertAppointments(Appointments appointments);

    /**
     * 修改预约：租客预约看房记录
     * 
     * @param appointments 预约：租客预约看房记录
     * @return 结果
     */
    public int updateAppointments(Appointments appointments);

    /**
     * 删除预约：租客预约看房记录
     * 
     * @param id 预约：租客预约看房记录主键
     * @return 结果
     */
    public int deleteAppointmentsById(Long id);

    /**
     * 批量删除预约：租客预约看房记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAppointmentsByIds(Long[] ids);
}
