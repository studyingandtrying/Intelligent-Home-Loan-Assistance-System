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
import com.qy.admin.domain.Contracts;
import com.qy.admin.service.IContractsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 合同：租赁合同信息Controller
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
@RestController
@RequestMapping("/contracts/contracts")
public class ContractsController extends BaseController
{
    @Autowired
    private IContractsService contractsService;

    /**
     * 查询合同：租赁合同信息列表
     */
    @PreAuthorize("@ss.hasPermi('contracts:contracts:list')")
    @GetMapping("/list")
    public TableDataInfo list(Contracts contracts)
    {
        startPage();
        List<Contracts> list = contractsService.selectContractsList(contracts);
        return getDataTable(list);
    }

    /**
     * 导出合同：租赁合同信息列表
     */
    @PreAuthorize("@ss.hasPermi('contracts:contracts:export')")
    @Log(title = "合同：租赁合同信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Contracts contracts)
    {
        List<Contracts> list = contractsService.selectContractsList(contracts);
        ExcelUtil<Contracts> util = new ExcelUtil<Contracts>(Contracts.class);
        util.exportExcel(response, list, "合同：租赁合同信息数据");
    }

    /**
     * 获取合同：租赁合同信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('contracts:contracts:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(contractsService.selectContractsById(id));
    }

    /**
     * 新增合同：租赁合同信息
     */
    @PreAuthorize("@ss.hasPermi('contracts:contracts:add')")
    @Log(title = "合同：租赁合同信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Contracts contracts)
    {
        return toAjax(contractsService.insertContracts(contracts));
    }

    /**
     * 修改合同：租赁合同信息
     */
    @PreAuthorize("@ss.hasPermi('contracts:contracts:edit')")
    @Log(title = "合同：租赁合同信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Contracts contracts)
    {
        return toAjax(contractsService.updateContracts(contracts));
    }

    /**
     * 删除合同：租赁合同信息
     */
    @PreAuthorize("@ss.hasPermi('contracts:contracts:remove')")
    @Log(title = "合同：租赁合同信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(contractsService.deleteContractsByIds(ids));
    }
}
