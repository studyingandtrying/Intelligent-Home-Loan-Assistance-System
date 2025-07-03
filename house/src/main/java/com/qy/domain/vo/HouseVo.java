package com.qy.domain.vo;

import com.alibaba.fastjson2.JSON;
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
public class HouseVo {
    private Integer id;
    private String title;
    private Double rent;
    private String deposit;
    private String type;
    private Double area;
    private Integer rooms;
    private String district;
    private String address;
    private String contact;
    private String description;
    private JSON facillities;
    private JSON images;
    private Integer landlordId;
    private String status;
    private Integer viewCount;
}
