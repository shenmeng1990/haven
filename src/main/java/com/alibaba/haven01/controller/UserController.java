package com.alibaba.haven01.controller;

import com.alibaba.haven01.common.HavenResult;
import com.alibaba.haven01.model.User;
import com.alibaba.haven01.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Author shenmeng
 * @Date 2020-04-30
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("list")
    public HavenResult listUser(){
        PageHelper.startPage(1,3);
        List<User> userList = userService.getUserList();
        PageInfo<User> pageInfo=new PageInfo(userList,3);
       return HavenResult.successResult(pageInfo.getList(),pageInfo.getTotal());
    }

    @RequestMapping("insert")
    public void insertUser(){
        List<User> userList = Lists.newArrayList();
        for(int i=0;i<10;i++){
            User user =new User();
            user.setId(i+1);
            user.setUsername("userName"+i);
            user.setAddress("address"+i);
            if(i%2==0){
                user.setSex("female");
            }else{
                user.setSex("male");
            }
            user.setBirthday(new Date());
            userList.add(user);
        }
        userService.insertUser(userList);
    }

    @InitBinder
    public void initBinder(){
        System.out.println("init binder");
    }

}
