package com.qy.service.house.impl;

import com.qy.domain.dto.ReviewDto;
import com.qy.domain.pojo.ReviewPojo;
import com.qy.mapper.house.MyReviewMapper;
import com.qy.service.house.MyReviewService;
import com.qy.utils.BaseContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyReviewServiceImpl implements MyReviewService {

    @Autowired
    private MyReviewMapper myReviewMapper;
    @Override
    public void addReview(ReviewDto reviewDto) {
        myReviewMapper.insertReviewPojo(ReviewPojo.builder()
                        .houseId(reviewDto.getHouseId())
                        .tenantId(BaseContext.getCurrentId())
                        .landlordId(reviewDto.getLandlordId())
                        .rating(reviewDto.getRating())
                        .content(reviewDto.getContent())
                .build());
    }

    @Override
    public void replyReview(ReviewDto reviewDto) {
        myReviewMapper.updateReview(ReviewPojo.builder()
                        .reply(reviewDto.getReply())
                        .id(reviewDto.getId())
                .build());
    }
}
