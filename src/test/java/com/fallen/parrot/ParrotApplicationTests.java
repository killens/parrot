package com.fallen.parrot;

import com.fallen.parrot.mybatis.entity.UserThirdAccessEntity;
import com.fallen.parrot.mybatis.mapper.UserMapper;
import com.fallen.parrot.mybatis.mapper.UserThirdAccessMapper;
import com.fallen.parrot.tool.random.hashid.HashidTool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParrotApplicationTests {

    private UserMapper userMapper;
    private UserThirdAccessMapper userThirdAccessMapper;

    @Resource
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Resource
    public void setUserThirdAccessMapper(UserThirdAccessMapper userThirdAccessMapper) {
        this.userThirdAccessMapper = userThirdAccessMapper;
    }

    @Test
    public void contextLoads() {
        UserThirdAccessEntity access = userThirdAccessMapper.findByUserId(Long.valueOf(2), 1);
        if (access != null) {
            System.out.println(access.getUser().getId());
            System.out.println(access.getUserId());
            System.out.println(access.getId());
            System.out.println(access.getType());
            System.out.println(access.getUser().getType());
            System.out.println(access.getUser().getCreateAt());
        } else {
            System.out.println("无记录");
        }
        HashidTool tool = new HashidTool();
        System.out.println(tool.getHashids().encode(1,2,3));
    }

}
