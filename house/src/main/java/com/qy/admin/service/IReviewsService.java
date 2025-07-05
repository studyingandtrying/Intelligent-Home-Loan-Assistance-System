package com.qy.admin.service;

import java.util.List;
import com.qy.admin.domain.Reviews;

/**
 * 评价：房源与房东评价信息Service接口
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public interface IReviewsService 
{
    /**
     * 查询评价：房源与房东评价信息
     * 
     * @param id 评价：房源与房东评价信息主键
     * @return 评价：房源与房东评价信息
     */
    public Reviews selectReviewsById(Long id);

    /**
     * 查询评价：房源与房东评价信息列表
     * 
     * @param reviews 评价：房源与房东评价信息
     * @return 评价：房源与房东评价信息集合
     */
    public List<Reviews> selectReviewsList(Reviews reviews);

    /**
     * 新增评价：房源与房东评价信息
     * 
     * @param reviews 评价：房源与房东评价信息
     * @return 结果
     */
    public int insertReviews(Reviews reviews);

    /**
     * 修改评价：房源与房东评价信息
     * 
     * @param reviews 评价：房源与房东评价信息
     * @return 结果
     */
    public int updateReviews(Reviews reviews);

    /**
     * 批量删除评价：房源与房东评价信息
     * 
     * @param ids 需要删除的评价：房源与房东评价信息主键集合
     * @return 结果
     */
    public int deleteReviewsByIds(Long[] ids);

    /**
     * 删除评价：房源与房东评价信息信息
     * 
     * @param id 评价：房源与房东评价信息主键
     * @return 结果
     */
    public int deleteReviewsById(Long id);
}
