package com.zdd.noob.service;

import com.zdd.noob.inter.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String login(String username, String password) {
        System.out.println("login usernam: " + username + ", password: " + password);;
        if (username == null) {
            throw new NullPointerException("username is null");
        }
        return "ok";
    }

    @Override
    public String register(String username, String password) {
        System.out.println("register username: " + username + ", password: " + password);
        return "ok";
    }
}
