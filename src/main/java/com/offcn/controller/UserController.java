package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @GetMapping("/second")
    public String indexPage(Model model){

        User tom = new User("tom", "123");
        Map<String,String> map = new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("pic",map);
        model.addAttribute("user",tom);
        return "index";
    }
    @GetMapping("/three")
    public String indexPage1(Model model){
        User tom1 = new User("tom1", "123456");
        User tom2 = new User("tom2", "123456");
        User tom3 = new User("tom3", "123456");
        List<User> users = new ArrayList<>();
        users.add(tom1);
        users.add(tom2);
        users.add(tom3);
        model.addAttribute("users",users);
        return "index2";
    }
}
