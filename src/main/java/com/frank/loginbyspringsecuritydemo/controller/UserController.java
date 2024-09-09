package com.frank.loginbyspringsecuritydemo.controller;


import com.frank.loginbyspringsecuritydemo.pojo.User;
import com.frank.loginbyspringsecuritydemo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody User user){
        userService.register(user);
    }
}
