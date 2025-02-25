package com.example.mybatis_graalvm.service;

import com.example.mybatis_graalvm.entity.User;
import com.example.mybatis_graalvm.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll().stream()
                .map(modelUser -> new User(modelUser.getId(), modelUser.getName()))
                .toList();
    }
}

