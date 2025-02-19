package com.example.mybatis_graalvm.service;

import com.example.mybatis_graalvm.entity.User;
import com.example.mybatis_graalvm.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    private final UserMapper userMapper;

    public UsersService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public List<User> getAllUsers() {
        return userMapper.findAll();
    }
}
