package com.fallen.parrot.mybatis.mapper;

import com.fallen.parrot.mybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM vue_user")
    @Results({
            @Result(property = "userSex", column = "user_sex")
    })
    List<UserEntity> getAll();

}
