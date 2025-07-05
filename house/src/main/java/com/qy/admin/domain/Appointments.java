package com.qy.admin.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预约：租客预约看房记录对象 appointments
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public class Appointments extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 房源ID（外键） */
    @Excel(name = "房源ID", readConverterExp = "外=键")
    private Long houseId;

    /** 租客ID（外键） */
    @Excel(name = "租客ID", readConverterExp = "外=键")
    private Long tenantId;

    /** 房东ID（外键） */
    @Excel(name = "房东ID", readConverterExp = "外=键")
    private Long landlordId;

    /** 预约看房时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预约看房时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date appointmentTime;

    /** 预约联系人姓名 */
    @Excel(name = "预约联系人姓名")
    private String contactName;

    /** 预约联系人电话 */
    @Excel(name = "预约联系人电话")
    private String contactPhone;

    /** 预约状态 */
    @Excel(name = "预约状态")
    private String status;

    /** 拒绝原因（如有） */
    @Excel(name = "拒绝原因", readConverterExp = "如=有")
    private String rejectReason;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 最后更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setHouseId(Long houseId) 
    {
        this.houseId = houseId;
    }

    public Long getHouseId() 
    {
        return houseId;
    }

    public void setTenantId(Long tenantId) 
    {
        this.tenantId = tenantId;
    }

    public Long getTenantId() 
    {
        return tenantId;
    }

    public void setLandlordId(Long landlordId) 
    {
        this.landlordId = landlordId;
    }

    public Long getLandlordId() 
    {
        return landlordId;
    }

    public void setAppointmentTime(Date appointmentTime) 
    {
        this.appointmentTime = appointmentTime;
    }

    public Date getAppointmentTime() 
    {
        return appointmentTime;
    }

    public void setContactName(String contactName) 
    {
        this.contactName = contactName;
    }

    public String getContactName() 
    {
        return contactName;
    }

    public void setContactPhone(String contactPhone) 
    {
        this.contactPhone = contactPhone;
    }

    public String getContactPhone() 
    {
        return contactPhone;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setRejectReason(String rejectReason) 
    {
        this.rejectReason = rejectReason;
    }

    public String getRejectReason() 
    {
        return rejectReason;
    }

    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }

    public void setUpdatedAt(Date updatedAt) 
    {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() 
    {
        return updatedAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("houseId", getHouseId())
            .append("tenantId", getTenantId())
            .append("landlordId", getLandlordId())
            .append("appointmentTime", getAppointmentTime())
            .append("contactName", getContactName())
            .append("contactPhone", getContactPhone())
            .append("remark", getRemark())
            .append("status", getStatus())
            .append("rejectReason", getRejectReason())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}
