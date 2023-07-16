package com.example.InstagramBasic.Instagram.Basic.Design.repository;

import com.example.InstagramBasic.Instagram.Basic.Design.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {
    User findFirstByUserEmail(String newEmail);
}
