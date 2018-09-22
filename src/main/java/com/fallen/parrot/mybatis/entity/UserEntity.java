package com.fallen.parrot.mybatis.entity;

import java.io.Serializable;

public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Integer type;
    private Integer userSex;

    public UserEntity()
    {
        super();
    }

    public UserEntity(String name, Integer type, Integer userSex)
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

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "name: " + name + ",type: " + type + ",user_sex: " + userSex;
    }
}
