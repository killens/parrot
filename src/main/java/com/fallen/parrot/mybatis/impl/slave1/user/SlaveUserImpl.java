package com.fallen.parrot.mybatis.impl.slave1.user;

import com.fallen.parrot.mybatis.entity.UserEntity;
import com.fallen.parrot.mybatis.impl.slave1.BaseServiceImpl;
import com.fallen.parrot.mybatis.mapper.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class SlaveUserImpl extends BaseServiceImpl<UserEntity, UserMapper> {
}
