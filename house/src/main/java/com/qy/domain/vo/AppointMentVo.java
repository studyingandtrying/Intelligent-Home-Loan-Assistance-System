package com.qy.domain.vo;

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
public class AppointMentVo {
    private Integer id;
    private Integer houseId;
    private Integer tenantId;
    private Integer landlordId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime appointmentTime;
    private String contactName;
    private String contactPhone;
    private String remark;
    private String status;
    private String rejectReason;

}
