package com.fallen.parrot.mybatis.mapper;

import com.fallen.parrot.mybatis.entity.UserEntity;
import com.fallen.parrot.mybatis.enums.UserSexEnum;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM vue_user")
    @Result({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class)
    })
    List<UserEntity> getAll();

}
