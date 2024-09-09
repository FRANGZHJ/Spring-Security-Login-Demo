package com.frank.loginbyspringsecuritydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frank.loginbyspringsecuritydemo.config.MyUserDetailsManager;
import com.frank.loginbyspringsecuritydemo.mapper.UserMapper;
import com.frank.loginbyspringsecuritydemo.pojo.User;
import com.frank.loginbyspringsecuritydemo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
* @author Frank
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-09-09 19:07:46
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

    @Resource
    private MyUserDetailsManager myUserDetailsManager;

    @Override
    public void register(User user) {
        UserDetails userDetails = org.springframework.security.core.userdetails.User
                .withDefaultPasswordEncoder() //使用默认加密器，bcrypt
                .username(user.getUsername()) //自定义用户名
                .password(user.getPassword()) //自定义密码
                .build();
        myUserDetailsManager.createUser(userDetails);

    }

}




