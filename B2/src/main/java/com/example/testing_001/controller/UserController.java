package com.example.testing_001.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.testing_001.service.UserService;
import com.example.testing_001.model.User;



@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        userService.addUser(user);
    }
}
