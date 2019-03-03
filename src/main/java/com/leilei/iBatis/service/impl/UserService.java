package com.leilei.iBatis.service.impl;

import com.leilei.iBatis.mapper.UserMapper;
import com.leilei.iBatis.pojo.User;
import com.leilei.iBatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }
}
