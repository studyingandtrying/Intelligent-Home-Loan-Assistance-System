package com.qy.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SearchHouseParam {
    private String district;
    private String type;
    private Double rentMin=Double.MIN_VALUE;
    private Double rentMax=Double.MAX_VALUE;
    private Integer pageSize;
    private Integer pageNum;
    private Integer offSet;
}
