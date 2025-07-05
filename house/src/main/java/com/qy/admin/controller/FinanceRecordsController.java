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
import com.qy.admin.domain.FinanceRecords;
import com.qy.admin.service.IFinanceRecordsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务记录：用户收支流水记录Controller
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
@RestController
@RequestMapping("/finance/records")
public class FinanceRecordsController extends BaseController
{
    @Autowired
    private IFinanceRecordsService financeRecordsService;

    /**
     * 查询财务记录：用户收支流水记录列表
     */
    @PreAuthorize("@ss.hasPermi('finance:records:list')")
    @GetMapping("/list")
    public TableDataInfo list(FinanceRecords financeRecords)
    {
        startPage();
        List<FinanceRecords> list = financeRecordsService.selectFinanceRecordsList(financeRecords);
        return getDataTable(list);
    }

    /**
     * 导出财务记录：用户收支流水记录列表
     */
    @PreAuthorize("@ss.hasPermi('finance:records:export')")
    @Log(title = "财务记录：用户收支流水记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FinanceRecords financeRecords)
    {
        List<FinanceRecords> list = financeRecordsService.selectFinanceRecordsList(financeRecords);
        ExcelUtil<FinanceRecords> util = new ExcelUtil<FinanceRecords>(FinanceRecords.class);
        util.exportExcel(response, list, "财务记录：用户收支流水记录数据");
    }

    /**
     * 获取财务记录：用户收支流水记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('finance:records:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(financeRecordsService.selectFinanceRecordsById(id));
    }

    /**
     * 新增财务记录：用户收支流水记录
     */
    @PreAuthorize("@ss.hasPermi('finance:records:add')")
    @Log(title = "财务记录：用户收支流水记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FinanceRecords financeRecords)
    {
        return toAjax(financeRecordsService.insertFinanceRecords(financeRecords));
    }

    /**
     * 修改财务记录：用户收支流水记录
     */
    @PreAuthorize("@ss.hasPermi('finance:records:edit')")
    @Log(title = "财务记录：用户收支流水记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FinanceRecords financeRecords)
    {
        return toAjax(financeRecordsService.updateFinanceRecords(financeRecords));
    }

    /**
     * 删除财务记录：用户收支流水记录
     */
    @PreAuthorize("@ss.hasPermi('finance:records:remove')")
    @Log(title = "财务记录：用户收支流水记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(financeRecordsService.deleteFinanceRecordsByIds(ids));
    }
}
