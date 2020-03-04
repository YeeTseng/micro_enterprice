package com.zy.me.service;

import com.zy.me.model.Users;

public interface UserService {

    Users selectByPrimaryKey(String id);

    void deleteByPrimaryKey(String id);

    void insert(Users users);

    void insertSelective(Users users);

    void updateByPrimaryKeySelective(Users users);

    void updateByPrimaryKey(Users users);

}
