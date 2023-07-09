package com.example.Ecommerce_API.controller;

import com.example.Ecommerce_API.model.User;
import com.example.Ecommerce_API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }

    @GetMapping("user/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
