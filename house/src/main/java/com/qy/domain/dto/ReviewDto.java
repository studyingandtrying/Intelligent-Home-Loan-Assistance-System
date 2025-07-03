package com.qy.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewDto {
    private Integer id;
    private Integer houseId;
    private Integer tenantId;
    private Integer landlordId;
    private Integer rating;
    private String content;
    private String reply;


}
