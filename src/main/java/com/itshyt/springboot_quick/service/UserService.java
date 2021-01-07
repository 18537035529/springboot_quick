package com.itshyt.springboot_quick.service;

import com.itshyt.springboot_quick.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    /**
     * 获取用户信息
     */
    public User getUser(){
        return new User(1,"孙悟空","123456");
    }
}
