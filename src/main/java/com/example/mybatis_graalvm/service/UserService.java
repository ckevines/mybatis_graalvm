package com.example.mybatis_graalvm.service;

import com.example.mybatis_graalvm.entity.User;
import com.example.mybatis_graalvm.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

// UserService.java
@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUsers() {
        return userMapper.findAll();
    }
}
