package com.frank.loginbyspringsecuritydemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.frank.loginbyspringsecuritydemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Frank
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-09-09 19:07:46
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




