package com.qy.admin.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财务记录：用户收支流水记录对象 finance_records
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public class FinanceRecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 用户ID（外键） */
    @Excel(name = "用户ID", readConverterExp = "外=键")
    private Long userId;

    /** 收支类型：收入/支出 */
    @Excel(name = "收支类型：收入/支出")
    private String type;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal amount;

    /** 描述说明 */
    @Excel(name = "描述说明")
    private String description;

    /** 关联房源ID（可选） */
    @Excel(name = "关联房源ID", readConverterExp = "可=选")
    private Long relatedHouseId;

    /** 关联合同ID（可选） */
    @Excel(name = "关联合同ID", readConverterExp = "可=选")
    private Long relatedContractId;

    /** 记录生成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录生成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setRelatedHouseId(Long relatedHouseId) 
    {
        this.relatedHouseId = relatedHouseId;
    }

    public Long getRelatedHouseId() 
    {
        return relatedHouseId;
    }

    public void setRelatedContractId(Long relatedContractId) 
    {
        this.relatedContractId = relatedContractId;
    }

    public Long getRelatedContractId() 
    {
        return relatedContractId;
    }

    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("type", getType())
            .append("amount", getAmount())
            .append("description", getDescription())
            .append("relatedHouseId", getRelatedHouseId())
            .append("relatedContractId", getRelatedContractId())
            .append("createdAt", getCreatedAt())
            .toString();
    }
}
