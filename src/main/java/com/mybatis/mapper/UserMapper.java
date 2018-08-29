package com.mybatis.mapper;

import com.mybatis.entity.UserEntity;
import com.mybatis.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("Select * From users")
    @Results({
            @Result(property = "username", column = "username"),
            @Result(property = "sex", column = "sex", javaType = UserSexEnum.class)
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Result(property = "sex", column = "sex", javaType = UserSexEnum.class)
    UserEntity getOne(Integer id);

    @Insert("insert into users(username, password, sex) values (#{username}, #{password}, #{sex})")
    void insert(UserEntity userEntity);

    @Update("update user set username= #{username}, password=#{password} where id = #{id}")
    void update(UserEntity userEntity);

    @Delete("delete from user where id = #{id}")
    void delete(Long id);
}
