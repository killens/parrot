package com.fallen.parrot;

import com.fallen.parrot.mybatis.entity.UserEntity;
import com.fallen.parrot.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParrotApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<UserEntity> users = userMapper.getAll();
        System.out.println(users.toString());
    }

}
