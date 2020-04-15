package com.lovo.userserver.service.impl;

import com.lovo.userserver.dao.UserDao;
import com.lovo.userserver.entity.UserEntity;
import com.lovo.userserver.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;
    @Transactional
    public void savaUser(UserEntity userEntity) {
        userDao.save(userEntity);
    }

    @Override
    public UserEntity getUser(String userName, String password) {
        return userDao.findUserNameAndPassword(userName,password);
    }
}
