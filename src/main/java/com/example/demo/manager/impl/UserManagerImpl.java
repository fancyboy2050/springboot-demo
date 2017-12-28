package com.example.demo.manager.impl;

import com.example.demo.manager.UserManager;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tianbenzhen on 2017/11/13.
 */
@Component
public class UserManagerImpl implements UserManager{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(long id) {
        User user = userMapper.getUserById(id);
        if(user != null){
            return user;
        }
        return null;
    }
}
