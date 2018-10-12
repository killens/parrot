package com.fallen.parrot.mybatis.mapper;

import com.fallen.parrot.mybatis.entity.UserEntity;
import com.fallen.parrot.mybatis.enums.handle.UserSexHandle;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

    @Insert("INSERT INTO users(`name`, `type`, `nick_name`, `sex`, `birthday`, `phone`, `status`, `create_at`) " +
            "VALUES(#{name}, #{type}, #{nickName}, #{sex, typeHandler=com.fallen.parrot.mybatis.enums.handle.UserSexHandle}, #{birthday}, #{phone}, #{status}, #{createAt})")
    @Options(useGeneratedKeys=true, keyColumn="id")
    void insert(UserEntity user);

    @Select("SELECT id,name,type,nick_name,sex,birthday,phone,status,create_at FROM users WHERE ISNULL(delete_at)")
    @Results({
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "sex", column = "sex", typeHandler = UserSexHandle.class),
            @Result(property = "birthday", column = "birthday", jdbcType = JdbcType.DATE, javaType = Date.class),
            @Result(property = "createAt", column = "create_at", jdbcType = JdbcType.TIMESTAMP, javaType = Timestamp.class),

    })
    List<UserEntity> findAll();

    @Select("SELECT id,name,type,nick_name,sex,birthday,phone,status,create_at FROM users WHERE id=#{id} and ISNULL(delete_at)")
    @Results({
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "sex", column = "sex", typeHandler = UserSexHandle.class),
            @Result(property = "birthday", column = "birthday", jdbcType = JdbcType.DATE, javaType = Date.class),
            @Result(property = "createAt", column = "create_at", jdbcType = JdbcType.TIMESTAMP, javaType = Timestamp.class),
    })
    UserEntity findById(Long id);

}
