package com.qy.admin.service;

import java.util.List;
import com.qy.admin.domain.Appointments;

/**
 * 预约：租客预约看房记录Service接口
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public interface IAppointmentsService 
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
     * 批量删除预约：租客预约看房记录
     * 
     * @param ids 需要删除的预约：租客预约看房记录主键集合
     * @return 结果
     */
    public int deleteAppointmentsByIds(Long[] ids);

    /**
     * 删除预约：租客预约看房记录信息
     * 
     * @param id 预约：租客预约看房记录主键
     * @return 结果
     */
    public int deleteAppointmentsById(Long id);
}
