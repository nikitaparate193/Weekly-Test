package com.example.InstagramBasic.Instagram.Basic.Design.service;

import com.example.InstagramBasic.Instagram.Basic.Design.model.Post;
import com.example.InstagramBasic.Instagram.Basic.Design.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;


    public String createInstaPost(Post post) {
        postRepo.save(post);
        return "Post uploaded!!!!";
    }


    public Optional<Post> getPostById(Integer postId) {
        return postRepo.findById(postId);
    }
}
