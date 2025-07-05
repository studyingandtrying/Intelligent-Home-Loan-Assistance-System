package com.qy.admin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.admin.mapper.AppointmentsMapper;
import com.qy.admin.domain.Appointments;
import com.qy.admin.service.IAppointmentsService;

/**
 * 预约：租客预约看房记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
@Service
public class AppointmentsServiceImpl implements IAppointmentsService 
{
    @Autowired
    private AppointmentsMapper appointmentsMapper;

    /**
     * 查询预约：租客预约看房记录
     * 
     * @param id 预约：租客预约看房记录主键
     * @return 预约：租客预约看房记录
     */
    @Override
    public Appointments selectAppointmentsById(Long id)
    {
        return appointmentsMapper.selectAppointmentsById(id);
    }

    /**
     * 查询预约：租客预约看房记录列表
     * 
     * @param appointments 预约：租客预约看房记录
     * @return 预约：租客预约看房记录
     */
    @Override
    public List<Appointments> selectAppointmentsList(Appointments appointments)
    {
        return appointmentsMapper.selectAppointmentsList(appointments);
    }

    /**
     * 新增预约：租客预约看房记录
     * 
     * @param appointments 预约：租客预约看房记录
     * @return 结果
     */
    @Override
    public int insertAppointments(Appointments appointments)
    {
        return appointmentsMapper.insertAppointments(appointments);
    }

    /**
     * 修改预约：租客预约看房记录
     * 
     * @param appointments 预约：租客预约看房记录
     * @return 结果
     */
    @Override
    public int updateAppointments(Appointments appointments)
    {
        return appointmentsMapper.updateAppointments(appointments);
    }

    /**
     * 批量删除预约：租客预约看房记录
     * 
     * @param ids 需要删除的预约：租客预约看房记录主键
     * @return 结果
     */
    @Override
    public int deleteAppointmentsByIds(Long[] ids)
    {
        return appointmentsMapper.deleteAppointmentsByIds(ids);
    }

    /**
     * 删除预约：租客预约看房记录信息
     * 
     * @param id 预约：租客预约看房记录主键
     * @return 结果
     */
    @Override
    public int deleteAppointmentsById(Long id)
    {
        return appointmentsMapper.deleteAppointmentsById(id);
    }
}
