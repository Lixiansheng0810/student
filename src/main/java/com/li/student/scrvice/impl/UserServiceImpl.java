package com.li.student.scrvice.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.student.mapper.UserMapper;
import com.li.student.pojo.User;
import com.li.student.scrvice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author li
 * @create 2022-05-04-12:56
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper usermapper;

    @Override
    public boolean login(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,username);
        queryWrapper.eq(User::getPassword,password);
        User us = usermapper.selectOne(queryWrapper);
        if (us == null) {
            return false;
        }
        return true;
    }

    @Override
    public void addUser(User user) {
        usermapper.insert(user);
    }

}
