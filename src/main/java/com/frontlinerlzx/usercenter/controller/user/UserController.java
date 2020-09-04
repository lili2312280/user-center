package com.frontlinerlzx.usercenter.controller.user;

import com.frontlinerlzx.usercenter.domain.entity.user.User;
import com.frontlinerlzx.usercenter.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建者： 李芝贤
 * 创建时间： 2020.09.03 - 上午 11:23
 * 类说明：
 */
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        return  userService.findById(id);
    }


}
