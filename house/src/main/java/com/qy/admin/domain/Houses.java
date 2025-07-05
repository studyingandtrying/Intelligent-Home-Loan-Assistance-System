package com.qy.admin.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 房源：存储房东发布的房屋信息对象 houses
 * 
 * @author ruoyi
 * @date 2025-07-05
 */
public class Houses extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 房东ID（外键） */
    @Excel(name = "房东ID", readConverterExp = "外=键")
    private Long landlordId;

    /** 房源标题 */
    @Excel(name = "房源标题")
    private String title;

    /** 月租金（单位：元） */
    @Excel(name = "月租金", readConverterExp = "单=位：元")
    private BigDecimal rent;

    /** 押金方式（1=押一付一，3=押一付三，12=年付） */
    @Excel(name = "押金方式", readConverterExp = "1==押一付一，3=押一付三，12=年付")
    private String deposit;

    /** 房屋类型（整租/合租/单间） */
    @Excel(name = "房屋类型", readConverterExp = "整=租/合租/单间")
    private String type;

    /** 面积（平方米） */
    @Excel(name = "面积", readConverterExp = "平=方米")
    private BigDecimal area;

    /** 房间数量 */
    @Excel(name = "房间数量")
    private Long rooms;

    /** 所在区域（城市/区） */
    @Excel(name = "所在区域", readConverterExp = "城=市/区")
    private String district;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String address;

    /** 房东联系电话 */
    @Excel(name = "房东联系电话")
    private String contact;

    /** 房源描述 */
    @Excel(name = "房源描述")
    private String description;

    /** 配套设施（JSON数组） */
    @Excel(name = "配套设施", readConverterExp = "J=SON数组")
    private String facilities;

    /** 房源图片URL列表（JSON数组） */
    @Excel(name = "房源图片URL列表", readConverterExp = "J=SON数组")
    private String images;

    /** 状态：待审核/已发布/已下架/已驳回 */
    @Excel(name = "状态：待审核/已发布/已下架/已驳回")
    private String status;

    /** 浏览次数 */
    @Excel(name = "浏览次数")
    private Long viewCount;

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

    public void setLandlordId(Long landlordId) 
    {
        this.landlordId = landlordId;
    }

    public Long getLandlordId() 
    {
        return landlordId;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setRent(BigDecimal rent) 
    {
        this.rent = rent;
    }

    public BigDecimal getRent() 
    {
        return rent;
    }

    public void setDeposit(String deposit) 
    {
        this.deposit = deposit;
    }

    public String getDeposit() 
    {
        return deposit;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    public void setArea(BigDecimal area) 
    {
        this.area = area;
    }

    public BigDecimal getArea() 
    {
        return area;
    }

    public void setRooms(Long rooms) 
    {
        this.rooms = rooms;
    }

    public Long getRooms() 
    {
        return rooms;
    }

    public void setDistrict(String district) 
    {
        this.district = district;
    }

    public String getDistrict() 
    {
        return district;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setFacilities(String facilities) 
    {
        this.facilities = facilities;
    }

    public String getFacilities() 
    {
        return facilities;
    }

    public void setImages(String images) 
    {
        this.images = images;
    }

    public String getImages() 
    {
        return images;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setViewCount(Long viewCount) 
    {
        this.viewCount = viewCount;
    }

    public Long getViewCount() 
    {
        return viewCount;
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
            .append("landlordId", getLandlordId())
            .append("title", getTitle())
            .append("rent", getRent())
            .append("deposit", getDeposit())
            .append("type", getType())
            .append("area", getArea())
            .append("rooms", getRooms())
            .append("district", getDistrict())
            .append("address", getAddress())
            .append("contact", getContact())
            .append("description", getDescription())
            .append("facilities", getFacilities())
            .append("images", getImages())
            .append("status", getStatus())
            .append("viewCount", getViewCount())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}
