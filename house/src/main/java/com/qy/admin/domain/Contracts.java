package com.qy.admin.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 合同：租赁合同信息对象 contracts
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public class Contracts extends BaseEntity
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

    /** 租期开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "租期开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 租期结束日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "租期结束日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 租金总额 */
    @Excel(name = "租金总额")
    private BigDecimal rentAmount;

    /** 押金金额 */
    @Excel(name = "押金金额")
    private BigDecimal depositAmount;

    /** 合同状态 */
    @Excel(name = "合同状态")
    private String status;

    /** 合同文件URL */
    @Excel(name = "合同文件URL")
    private String contractFile;

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

    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

    public Date getStartDate() 
    {
        return startDate;
    }

    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
    }

    public void setRentAmount(BigDecimal rentAmount) 
    {
        this.rentAmount = rentAmount;
    }

    public BigDecimal getRentAmount() 
    {
        return rentAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) 
    {
        this.depositAmount = depositAmount;
    }

    public BigDecimal getDepositAmount() 
    {
        return depositAmount;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setContractFile(String contractFile) 
    {
        this.contractFile = contractFile;
    }

    public String getContractFile() 
    {
        return contractFile;
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
            .append("startDate", getStartDate())
            .append("endDate", getEndDate())
            .append("rentAmount", getRentAmount())
            .append("depositAmount", getDepositAmount())
            .append("status", getStatus())
            .append("contractFile", getContractFile())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}
