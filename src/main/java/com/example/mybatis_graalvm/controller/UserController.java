package com.example.mybatis_graalvm.controller;

import com.example.mybatis_graalvm.entity.User;
import com.example.mybatis_graalvm.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return usersService.getAllUsers();
    }
}
