package com.frontlinerlzx.usercenter.controller;
import com.frontlinerlzx.usercenter.dao.user.UserMapper;
import com.frontlinerlzx.usercenter.domain.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 创建者： 李芝贤
 * 创建时间： 2020.09.02 - 下午 03:50
 * 类说明：
 */
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("test")
    public User testInsert() {
        User user = new User();
        user.setId(0);
        user.setWxId("");
        user.setWxNickname("");
        user.setRoles("");
        user.setAvatarUrl("xx");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setBonus(100);
        this.userMapper.insert(user);
        return user;
    }

    @GetMapping("/q")
    public User query(User user){

        return user;
    }
}
