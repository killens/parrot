package com.fallen.parrot;

import com.fallen.parrot.mybatis.entity.UserThirdAccessEntity;
import com.fallen.parrot.mybatis.mapper.UserMapper;
import com.fallen.parrot.mybatis.mapper.UserThirdAccessMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

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
        List<UserThirdAccessEntity> access = userThirdAccessMapper.getListByUserId(Long.valueOf(1));
        System.out.println(access.get(0).getUser().getSex().getString());
    }

}
