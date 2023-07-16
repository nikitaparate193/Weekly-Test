package com.example.InstagramBasic.Instagram.Basic.Design.service;

import com.example.InstagramBasic.Instagram.Basic.Design.model.AuthenticationToken;
import com.example.InstagramBasic.Instagram.Basic.Design.model.User;
import com.example.InstagramBasic.Instagram.Basic.Design.repository.IAuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    IAuthenticationRepo authenticationRepo;

    public void saveAuthToken(AuthenticationToken authToken) {

        authenticationRepo.save(authToken);
    }

    public boolean authenticate(String email, String token) {
        AuthenticationToken authToken = authenticationRepo.findFirstByToken(token);

        if(authToken == null)
        {
            return false;
        }

        String tokenConnectedEmail = authToken.getUser().getUserEmail();

        return tokenConnectedEmail.equals(email);
    }


}
