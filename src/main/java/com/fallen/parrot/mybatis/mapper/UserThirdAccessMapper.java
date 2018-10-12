package com.fallen.parrot.mybatis.mapper;

import com.fallen.parrot.mybatis.entity.UserThirdAccessEntity;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserThirdAccessMapper {

    @Select("SELECT id,user_id,type,openid,status FROM user_third_accesses WHERE id=#{id}")
    @Results({
            @Result(property = "userId", column = "user_id"),
    })
    UserThirdAccessEntity findById(Long id);

//    @Select("SELECT id,user_id,type,openid,status FROM user_third_accesses WHERE user_id=#{userId}")
//    @Results({
//            @Result(property="user",column="user_id",one=@One(select="com.fallen.parrot.mybatis.mapper.UserMapper.findById"))
//    })
    UserThirdAccessEntity findByUserId(@Param("userId") Long userId, @Param("type") int type);


}
