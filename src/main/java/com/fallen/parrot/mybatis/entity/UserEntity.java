package com.fallen.parrot.mybatis.entity;

import com.fallen.parrot.mybatis.enums.UserSexEnum;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Integer type;
    private String nickName;
    private UserSexEnum sex;
    private Date birthday;
    private String phone;
    private Integer status;
    private Timestamp createAt;
    private Timestamp updatedAt;
    private Timestamp deleteAt;
    private List<UserThirdAccessEntity> thirdAccess;

    public UserEntity()
    {
        super();
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public UserSexEnum getSex() {
        return sex;
    }

    public void setSex(UserSexEnum sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(Timestamp deleteAt) {
        this.deleteAt = deleteAt;
    }

    public List<UserThirdAccessEntity> getThirdAccess() {
        return thirdAccess;
    }

    public void setThirdAccess(List<UserThirdAccessEntity> thirdAccess) {
        this.thirdAccess = thirdAccess;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }
}
