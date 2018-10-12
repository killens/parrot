package com.fallen.parrot.mybatis.impl.user;

import com.fallen.parrot.mybatis.entity.UserEntity;
import com.fallen.parrot.mybatis.impl.BaseServiceI;
import com.fallen.parrot.mybatis.mapper.UserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserImpl implements BaseServiceI<UserEntity> {

    private UserMapper userMapper;

    @Resource
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserEntity insert(UserEntity entity) {
        userMapper.insert(entity);
        return entity;
    }

    @Override
    public UserEntity findById(Long id) {
        return userMapper.findById(id);
    }
}
