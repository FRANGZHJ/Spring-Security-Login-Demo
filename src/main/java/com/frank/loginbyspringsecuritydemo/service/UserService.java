package com.frank.loginbyspringsecuritydemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frank.loginbyspringsecuritydemo.pojo.User;

/**
* @author Frank
* @description 针对表【user】的数据库操作Service
* @createDate 2024-09-09 19:07:46
*/
public interface UserService extends IService<User> {

    void register(User user);
}
