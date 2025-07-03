package com.qy.service.house;

import com.qy.domain.dto.ReviewDto;

public interface MyReviewService {
    void addReview(ReviewDto reviewDto);

    void replyReview(ReviewDto reviewDto);
}
