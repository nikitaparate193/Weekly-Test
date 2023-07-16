package com.example.InstagramBasic.Instagram.Basic.Design.controller;

import com.example.InstagramBasic.Instagram.Basic.Design.model.Post;
import com.example.InstagramBasic.Instagram.Basic.Design.service.AuthenticationService;
import com.example.InstagramBasic.Instagram.Basic.Design.service.PostService;
import com.example.InstagramBasic.Instagram.Basic.Design.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    PostService postService;
    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    UserService userService;

    @PostMapping("post")
    public String createInstaPost(@RequestBody Post post, @RequestParam String email, @RequestParam String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.createInstaPost(post);
        }
        else {
            return "Not an Authenticated user activity!!!";
        }
    }

    @GetMapping("posts/{postId}")
    public Optional<Post> getPostById(@PathVariable Integer postId){
        return postService.getPostById(postId);
    }









}
