package com.fallen.parrot.mybatis.mapper;

import com.fallen.parrot.mybatis.entity.UserThirdAccessEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserThirdAccessMapper {

    @Select("SELECT id,user_id,type,openid,status FROM user_third_accesses where user_id=#{userId}")
    @Results({
            @Result(property="user",column="user_id",one=@One(select="com.fallen.parrot.mybatis.mapper.UserMapper.findById"))
    })
    List<UserThirdAccessEntity> getListByUserId(Long userId);
}
