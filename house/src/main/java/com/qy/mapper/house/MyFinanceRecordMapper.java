package com.qy.mapper.house;

import com.qy.domain.pojo.FinanceRecordPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MyFinanceRecordMapper {
    List<FinanceRecordPojo> selectMyFinanceRecord(@Param("userId") Integer userId);
}
