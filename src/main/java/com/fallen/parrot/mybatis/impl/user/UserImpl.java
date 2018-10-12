package com.fallen.parrot.mybatis.impl.user;

import com.fallen.parrot.mybatis.entity.UserEntity;
import com.fallen.parrot.mybatis.impl.BaseServiceImpl;
import com.fallen.parrot.mybatis.mapper.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class UserImpl extends BaseServiceImpl<UserEntity, UserMapper> {
}
