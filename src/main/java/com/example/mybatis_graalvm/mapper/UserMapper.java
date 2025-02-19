package com.example.mybatis_graalvm.mapper;

import com.example.mybatis_graalvm.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// UserMapper.java
@Mapper
public interface UserMapper {
    List<User> findAll();
}