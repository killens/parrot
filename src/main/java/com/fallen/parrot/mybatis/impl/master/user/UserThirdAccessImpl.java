package com.fallen.parrot.mybatis.impl.master.user;

import com.fallen.parrot.mybatis.entity.UserThirdAccessEntity;
import com.fallen.parrot.mybatis.impl.master.BaseServiceImpl;
import com.fallen.parrot.mybatis.mapper.UserThirdAccessMapper;
import org.springframework.stereotype.Component;

@Component
public class UserThirdAccessImpl extends BaseServiceImpl<UserThirdAccessEntity, UserThirdAccessMapper> {

    public UserThirdAccessEntity findByUserId(Long userId, int type) {
        return getMapper().findByUserId(userId, type);
    }
}
