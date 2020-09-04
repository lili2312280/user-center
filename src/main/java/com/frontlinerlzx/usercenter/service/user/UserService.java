package com.frontlinerlzx.usercenter.service.user;

import com.frontlinerlzx.usercenter.dao.user.UserMapper;
import com.frontlinerlzx.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 创建者： 李芝贤
 * 创建时间： 2020.09.03 - 上午 11:18
 * 类说明：
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
    private final UserMapper userMapper;

    public User findById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
