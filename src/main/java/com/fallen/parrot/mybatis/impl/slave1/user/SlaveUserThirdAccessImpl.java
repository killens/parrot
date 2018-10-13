package com.fallen.parrot.mybatis.impl.slave1.user;

import com.fallen.parrot.mybatis.entity.UserThirdAccessEntity;
import com.fallen.parrot.mybatis.impl.slave1.BaseServiceImpl;
import com.fallen.parrot.mybatis.mapper.UserThirdAccessMapper;
import org.springframework.stereotype.Component;

@Component
public class SlaveUserThirdAccessImpl extends BaseServiceImpl<UserThirdAccessEntity, UserThirdAccessMapper> {

    public UserThirdAccessEntity findByUserId(Long userId, int type) {
        return getMapper().findByUserId(userId, type);
    }

}