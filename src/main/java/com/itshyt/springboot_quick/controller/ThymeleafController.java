package com.itshyt.springboot_quick.controller;

import com.itshyt.springboot_quick.model.Blogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @RequestMapping("/test404")
    public String test404() {
        return "index";
    }

    @RequestMapping("/test500")
    public String test500() {
        int i = 1 / 0;
        return "index";
    }
    @RequestMapping("/getBlogger")
    public  String getBlogger(Model model){
        Blogger blogger = new Blogger(1,"齐天大圣","108000");
        return "blogger";
    }
}
