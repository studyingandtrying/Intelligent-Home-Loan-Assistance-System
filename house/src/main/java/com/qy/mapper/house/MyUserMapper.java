package com.qy.mapper.house;

import com.qy.domain.pojo.UserPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MyUserMapper {

    List<UserPojo> selectUserByUserName(@Param("username")String username);
    Integer insertUserByUserPojo(UserPojo userPojo);
}
