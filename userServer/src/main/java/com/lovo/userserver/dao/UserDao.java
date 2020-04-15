package com.lovo.userserver.dao;

import com.lovo.userserver.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserEntity,String> {

    @Query("from UserEntity where userName=?1 and password=?2")
    public  UserEntity findUserNameAndPassword(String userName,String password);
}
