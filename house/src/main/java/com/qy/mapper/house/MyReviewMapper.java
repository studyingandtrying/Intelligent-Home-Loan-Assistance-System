package com.qy.mapper.house;

import com.qy.domain.pojo.ReviewPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyReviewMapper {
    void insertReviewPojo(ReviewPojo reviewPojo);

    void updateReview(ReviewPojo build);
}
