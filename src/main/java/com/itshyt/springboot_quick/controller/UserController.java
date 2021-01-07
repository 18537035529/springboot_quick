package com.itshyt.springboot_quick.controller;

import com.itshyt.springboot_quick.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class UserController {
    @RequestMapping("/user")
    public User user(){
        User user = new User(1,"孙悟空","365");
        return user;
    }
    @RequestMapping("/list")
    public List<User> userlist(){
        List<User> list = new ArrayList<User>();
        User user1 = new User(2,"猪八戒","364");
        User user2= new User(2,"沙悟净","362");
        list.add(user1);
        list.add(user2);
       return list;
    }
    @RequestMapping("/map")
    public Map<String,Object> userMap(){
        User user3= new User(2,"师傅","362");
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("作者信息",user3);
        param.put("地址","东土大唐");
        param.put("目的","拜佛求经");
        return param;
    }
}
