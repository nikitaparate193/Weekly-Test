package com.example.Ecommerce_API.service;

import com.example.Ecommerce_API.model.User;
import com.example.Ecommerce_API.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public void createUser(User user) {
        userRepo.save(user);
    }

    public Optional<User> getUserById(Integer id) {
        return userRepo.findById(id);
    }
}
