package com;

import com.lovo.userserver.UserMain;
import com.lovo.userserver.dao.UserDao;
import com.lovo.userserver.entity.UserEntity;
import com.lovo.userserver.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserMain.class)
public class TestMain {
    @Autowired
    IUserService userService;
    @Test
    public void sava(){
        UserEntity u=new UserEntity();
        u.setUserName("zy");
        u.setPassword("123456");
        userService.savaUser(u);
    }


}
