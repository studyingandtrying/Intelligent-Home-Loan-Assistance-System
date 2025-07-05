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
import com.qy.admin.domain.Reviews;
import com.qy.admin.service.IReviewsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 评价：房源与房东评价信息Controller
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
@RestController
@RequestMapping("/review/reviews")
public class ReviewsController extends BaseController
{
    @Autowired
    private IReviewsService reviewsService;

    /**
     * 查询评价：房源与房东评价信息列表
     */
    @PreAuthorize("@ss.hasPermi('review:reviews:list')")
    @GetMapping("/list")
    public TableDataInfo list(Reviews reviews)
    {
        startPage();
        List<Reviews> list = reviewsService.selectReviewsList(reviews);
        return getDataTable(list);
    }

    /**
     * 导出评价：房源与房东评价信息列表
     */
    @PreAuthorize("@ss.hasPermi('review:reviews:export')")
    @Log(title = "评价：房源与房东评价信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Reviews reviews)
    {
        List<Reviews> list = reviewsService.selectReviewsList(reviews);
        ExcelUtil<Reviews> util = new ExcelUtil<Reviews>(Reviews.class);
        util.exportExcel(response, list, "评价：房源与房东评价信息数据");
    }

    /**
     * 获取评价：房源与房东评价信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('review:reviews:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(reviewsService.selectReviewsById(id));
    }

    /**
     * 新增评价：房源与房东评价信息
     */
    @PreAuthorize("@ss.hasPermi('review:reviews:add')")
    @Log(title = "评价：房源与房东评价信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Reviews reviews)
    {
        return toAjax(reviewsService.insertReviews(reviews));
    }

    /**
     * 修改评价：房源与房东评价信息
     */
    @PreAuthorize("@ss.hasPermi('review:reviews:edit')")
    @Log(title = "评价：房源与房东评价信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Reviews reviews)
    {
        return toAjax(reviewsService.updateReviews(reviews));
    }

    /**
     * 删除评价：房源与房东评价信息
     */
    @PreAuthorize("@ss.hasPermi('review:reviews:remove')")
    @Log(title = "评价：房源与房东评价信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(reviewsService.deleteReviewsByIds(ids));
    }
}
