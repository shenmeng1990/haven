package com.alibaba.haven01.service;

import com.alibaba.haven01.model.User;

import java.util.List;

/**
 * @Author shenmeng
 * @Date 2020-04-30
 **/
public interface UserService {


     List<User>  getUserList();

     void insertUser(List<User> userList);


}
