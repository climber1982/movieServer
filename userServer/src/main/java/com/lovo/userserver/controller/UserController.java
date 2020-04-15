package com.lovo.userserver.controller;

import com.lovo.userserver.entity.UserEntity;
import com.lovo.userserver.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping("userInfo/{userName}/{password}")
    public UserEntity userInfo(@PathVariable("userName")String userName,
                               @PathVariable("password")String password){
       return userService.getUser(userName,password);
    }
}
