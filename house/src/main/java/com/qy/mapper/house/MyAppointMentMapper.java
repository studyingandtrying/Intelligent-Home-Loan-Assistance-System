package com.qy.mapper.house;

import com.qy.domain.pojo.AppointMentPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MyAppointMentMapper {
    Integer insertAppointMent(AppointMentPojo appointMentPojo);

    void updateStatus(AppointMentPojo appointMentPojo);

    List<AppointMentPojo> selectAppointMentByLandLordId(@Param("userId") Integer userId);
}
