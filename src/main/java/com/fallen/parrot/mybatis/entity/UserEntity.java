package com.fallen.parrot.mybatis.entity;

import com.fallen.parrot.mybatis.enums.UserSexEnum;

import java.io.Serializable;

public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Integer type;
    private UserSexEnum userSex;

    public UserEntity(String name, Integer type, UserSexEnum userSex)
    {
        super();
        this.name = name;
        this.type = type;
        this.userSex = userSex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public UserSexEnum getUserSex() {
        return userSex;
    }

    public void setUserSex(UserSexEnum userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "name " + name + ",type " + type + ",user_sex, " + userSex;
    }
}
