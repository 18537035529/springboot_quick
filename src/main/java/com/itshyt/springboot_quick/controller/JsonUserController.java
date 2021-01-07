package com.itshyt.springboot_quick.controller;

import com.itshyt.springboot_quick.common.JsonResult;
import com.itshyt.springboot_quick.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jsonUser")
public class JsonUserController {
    @RequestMapping("/user")
    public JsonResult<User> user(){
        User user = new User(1,"孙悟空","365");
        return new JsonResult(user);
    }
    @RequestMapping("/userlist")
    public  JsonResult<List> getUserList(){
        User user = new User(1,"孙悟空","365");
        User user1 = new User(2,"猪八戒","364");
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        return new JsonResult<>(list,"0","操作成功");
    }
    @RequestMapping("/userMap")
    public JsonResult<Map> usermap(){
        User user = new User(3,"关云长","361");
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("User",user);
        param.put("brother","刘玄德");
        param.put("lessOldbrother","张翼德");
        return new JsonResult<>(param,"0","操作成功");
    }
}
