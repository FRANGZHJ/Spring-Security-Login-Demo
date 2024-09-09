package com.frank.loginbyspringsecuritydemo;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


public class testPassword {

    @Test
    void test(){

        PasswordEncoder encoder = new BCryptPasswordEncoder(4);
        String result = encoder.encode("123456");
        System.out.println(result);
    }

}
