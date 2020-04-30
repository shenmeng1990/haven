package com.alibaba.haven01.service.impl;

import com.alibaba.haven01.dao.UserMapper;
import com.alibaba.haven01.model.User;
import com.alibaba.haven01.service.UserService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Author shenmeng
 * @Date 2020-04-30
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return  userMapper.selectAll();
    }

    @Override
    public void insertUser(List<User> userList) {
        List<User> users = Optional.ofNullable(userList).orElse(Lists.newArrayList());
        users.forEach(user->{
            userMapper.insert(user);
        });
    }
}
