package com.mybatis.entity;

import com.mybatis.enums.UserSexEnum;

/**
 * @author wchkong
 */
public class UserEntity {

    private Integer id;
    private String username;
    private String password;
    private UserSexEnum sex;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserSexEnum getSex() {
        return sex;
    }

    public void setSex(UserSexEnum sex) {
        this.sex = sex;
    }

    public UserEntity(Integer id, String username, String password, UserSexEnum sex) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
    }

    public UserEntity() {
        super();
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
