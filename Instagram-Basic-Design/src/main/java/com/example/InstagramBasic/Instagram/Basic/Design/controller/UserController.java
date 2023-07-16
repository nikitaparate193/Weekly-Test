package com.example.InstagramBasic.Instagram.Basic.Design.controller;

import com.example.InstagramBasic.Instagram.Basic.Design.model.User;
import com.example.InstagramBasic.Instagram.Basic.Design.model.dto.SignInInput;
import com.example.InstagramBasic.Instagram.Basic.Design.model.dto.SignUpOutput;
import com.example.InstagramBasic.Instagram.Basic.Design.service.AuthenticationService;
import com.example.InstagramBasic.Instagram.Basic.Design.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
public class UserController {

    //sign in
    //sign up
    //update user details

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;


    @PostMapping("user/signup")
    public SignUpOutput signUpInstaUser(@RequestBody User user){
        return userService.signUpInstaUser(user);
    }

    @PostMapping("user/signIn")
    public String signInInstaUser(@RequestBody @Valid SignInInput signInInput){
        return userService.signInInstaUser(signInInput);
    }

    @PutMapping("users/{userId}/{userEmail}")
    public String updateUserDetails(@PathVariable Integer userId, @RequestParam String userEmail){
        return userService.updateUserDetails(userId,userEmail);
    }

}
