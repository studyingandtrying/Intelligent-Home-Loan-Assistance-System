package com.qy.admin.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.qy.admin.domain.Appointments;
import com.qy.admin.service.IAppointmentsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 预约：租客预约看房记录Controller
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
@RestController
@RequestMapping("/appointments/appointments")
public class AppointmentsController extends BaseController
{
    @Autowired
    private IAppointmentsService appointmentsService;

    /**
     * 查询预约：租客预约看房记录列表
     */
    @PreAuthorize("@ss.hasPermi('appointments:appointments:list')")
    @GetMapping("/list")
    public TableDataInfo list(Appointments appointments)
    {
        startPage();
        List<Appointments> list = appointmentsService.selectAppointmentsList(appointments);
        return getDataTable(list);
    }

    /**
     * 导出预约：租客预约看房记录列表
     */
    @PreAuthorize("@ss.hasPermi('appointments:appointments:export')")
    @Log(title = "预约：租客预约看房记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Appointments appointments)
    {
        List<Appointments> list = appointmentsService.selectAppointmentsList(appointments);
        ExcelUtil<Appointments> util = new ExcelUtil<Appointments>(Appointments.class);
        util.exportExcel(response, list, "预约：租客预约看房记录数据");
    }

    /**
     * 获取预约：租客预约看房记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('appointments:appointments:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(appointmentsService.selectAppointmentsById(id));
    }

    /**
     * 新增预约：租客预约看房记录
     */
    @PreAuthorize("@ss.hasPermi('appointments:appointments:add')")
    @Log(title = "预约：租客预约看房记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Appointments appointments)
    {
        return toAjax(appointmentsService.insertAppointments(appointments));
    }

    /**
     * 修改预约：租客预约看房记录
     */
    @PreAuthorize("@ss.hasPermi('appointments:appointments:edit')")
    @Log(title = "预约：租客预约看房记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Appointments appointments)
    {
        return toAjax(appointmentsService.updateAppointments(appointments));
    }

    /**
     * 删除预约：租客预约看房记录
     */
    @PreAuthorize("@ss.hasPermi('appointments:appointments:remove')")
    @Log(title = "预约：租客预约看房记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(appointmentsService.deleteAppointmentsByIds(ids));
    }
}
