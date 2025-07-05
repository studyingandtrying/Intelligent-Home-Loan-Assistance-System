package com.qy.admin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.admin.mapper.ReviewsMapper;
import com.qy.admin.domain.Reviews;
import com.qy.admin.service.IReviewsService;

/**
 * 评价：房源与房东评价信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
@Service
public class ReviewsServiceImpl implements IReviewsService 
{
    @Autowired
    private ReviewsMapper reviewsMapper;

    /**
     * 查询评价：房源与房东评价信息
     * 
     * @param id 评价：房源与房东评价信息主键
     * @return 评价：房源与房东评价信息
     */
    @Override
    public Reviews selectReviewsById(Long id)
    {
        return reviewsMapper.selectReviewsById(id);
    }

    /**
     * 查询评价：房源与房东评价信息列表
     * 
     * @param reviews 评价：房源与房东评价信息
     * @return 评价：房源与房东评价信息
     */
    @Override
    public List<Reviews> selectReviewsList(Reviews reviews)
    {
        return reviewsMapper.selectReviewsList(reviews);
    }

    /**
     * 新增评价：房源与房东评价信息
     * 
     * @param reviews 评价：房源与房东评价信息
     * @return 结果
     */
    @Override
    public int insertReviews(Reviews reviews)
    {
        return reviewsMapper.insertReviews(reviews);
    }

    /**
     * 修改评价：房源与房东评价信息
     * 
     * @param reviews 评价：房源与房东评价信息
     * @return 结果
     */
    @Override
    public int updateReviews(Reviews reviews)
    {
        return reviewsMapper.updateReviews(reviews);
    }

    /**
     * 批量删除评价：房源与房东评价信息
     * 
     * @param ids 需要删除的评价：房源与房东评价信息主键
     * @return 结果
     */
    @Override
    public int deleteReviewsByIds(Long[] ids)
    {
        return reviewsMapper.deleteReviewsByIds(ids);
    }

    /**
     * 删除评价：房源与房东评价信息信息
     * 
     * @param id 评价：房源与房东评价信息主键
     * @return 结果
     */
    @Override
    public int deleteReviewsById(Long id)
    {
        return reviewsMapper.deleteReviewsById(id);
    }
}
