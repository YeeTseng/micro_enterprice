package com.zy.me.service;

import com.zy.me.model.Users;

import java.util.Map;

public interface UserService {

    Users selectByPrimaryKey(String id);

    void deleteByPrimaryKey(String id);

    void insert(Users users);

    void insertSelective(Users users);

    void updateByPrimaryKeySelective(Users users);

    void updateByPrimaryKey(Users users);

    Users selectByUsername(Map<String,Object> map);
}
