package com.fallen.parrot;

import com.alibaba.fastjson.JSONObject;
import com.fallen.parrot.mybatis.entity.UserEntity;
import com.fallen.parrot.mybatis.entity.UserThirdAccessEntity;
import com.fallen.parrot.mybatis.impl.user.UserImpl;
import com.fallen.parrot.mybatis.mapper.UserMapper;
import com.fallen.parrot.mybatis.mapper.UserThirdAccessMapper;
import com.fallen.parrot.tool.convertor.JsonTool;
import com.fallen.parrot.tool.convertor.response.ResponseModel;
import com.fallen.parrot.tool.random.hashid.HashidTool;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
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
    private SqlSessionFactory sqlSessionFactory;
    private UserImpl userImpl;

    @Resource
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Resource
    public void setUserThirdAccessMapper(UserThirdAccessMapper userThirdAccessMapper) {
        this.userThirdAccessMapper = userThirdAccessMapper;
    }

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Resource
    public void setUserImpl(UserImpl userImpl) {
        this.userImpl = userImpl;
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
//        SqlSession session = sqlSessionFactory.openSession();

//        UserEntity user = new UserEntity("132****5678", "132****5678", 1, "13212345678");
//        userImpl.insert(user);
//        System.out.println(user.getId());

        String jsonString = JsonTool.toJson(new ResponseModel());
        ResponseModel responseObject = JsonTool.parse(jsonString);
        System.out.println(responseObject);
        System.out.println(responseObject.getCode());
    }

}
