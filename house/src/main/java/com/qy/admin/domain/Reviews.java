package com.qy.admin.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评价：房源与房东评价信息对象 reviews
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public class Reviews extends BaseEntity
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

    /** 评分（1-5分） */
    @Excel(name = "评分", readConverterExp = "1=-5分")
    private Long rating;

    /** 评价内容 */
    @Excel(name = "评价内容")
    private String content;

    /** 房东回复 */
    @Excel(name = "房东回复")
    private String reply;

    /** 评价时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "评价时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

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

    public void setRating(Long rating) 
    {
        this.rating = rating;
    }

    public Long getRating() 
    {
        return rating;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setReply(String reply) 
    {
        this.reply = reply;
    }

    public String getReply() 
    {
        return reply;
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
            .append("houseId", getHouseId())
            .append("tenantId", getTenantId())
            .append("landlordId", getLandlordId())
            .append("rating", getRating())
            .append("content", getContent())
            .append("reply", getReply())
            .append("createdAt", getCreatedAt())
            .toString();
    }
}
