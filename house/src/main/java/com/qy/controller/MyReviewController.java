package com.qy.controller;

import com.qy.domain.dto.ReviewDto;
import com.qy.service.house.MyReviewService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/house/review")
public class MyReviewController {

    @Autowired
    private MyReviewService myReviewService;

    @PostMapping("/addReview")
    public AjaxResult add(@RequestBody ReviewDto reviewDto){
        myReviewService.addReview(reviewDto);
        return AjaxResult.success("评论成功！");
    }

    @PutMapping("/reply")
    public AjaxResult reply(@RequestBody ReviewDto reviewDto){
        myReviewService.replyReview(reviewDto);
        return AjaxResult.success("回复成功！");
    }
}
