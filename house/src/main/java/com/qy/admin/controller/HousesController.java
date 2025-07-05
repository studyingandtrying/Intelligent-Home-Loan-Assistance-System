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
import com.qy.admin.domain.Houses;
import com.qy.admin.service.IHousesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 房源：存储房东发布的房屋信息Controller
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
@RestController
@RequestMapping("/house/houses")
public class HousesController extends BaseController
{
    @Autowired
    private IHousesService housesService;

    /**
     * 查询房源：存储房东发布的房屋信息列表
     */
    @PreAuthorize("@ss.hasPermi('house:houses:list')")
    @GetMapping("/list")
    public TableDataInfo list(Houses houses)
    {
        startPage();
        List<Houses> list = housesService.selectHousesList(houses);
        return getDataTable(list);
    }

    /**
     * 导出房源：存储房东发布的房屋信息列表
     */
    @PreAuthorize("@ss.hasPermi('house:houses:export')")
    @Log(title = "房源：存储房东发布的房屋信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Houses houses)
    {
        List<Houses> list = housesService.selectHousesList(houses);
        ExcelUtil<Houses> util = new ExcelUtil<Houses>(Houses.class);
        util.exportExcel(response, list, "房源：存储房东发布的房屋信息数据");
    }

    /**
     * 获取房源：存储房东发布的房屋信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('house:houses:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(housesService.selectHousesById(id));
    }

    /**
     * 新增房源：存储房东发布的房屋信息
     */
    @PreAuthorize("@ss.hasPermi('house:houses:add')")
    @Log(title = "房源：存储房东发布的房屋信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Houses houses)
    {
        return toAjax(housesService.insertHouses(houses));
    }

    /**
     * 修改房源：存储房东发布的房屋信息
     */
    @PreAuthorize("@ss.hasPermi('house:houses:edit')")
    @Log(title = "房源：存储房东发布的房屋信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Houses houses)
    {
        return toAjax(housesService.updateHouses(houses));
    }

    /**
     * 删除房源：存储房东发布的房屋信息
     */
    @PreAuthorize("@ss.hasPermi('house:houses:remove')")
    @Log(title = "房源：存储房东发布的房屋信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(housesService.deleteHousesByIds(ids));
    }
}
