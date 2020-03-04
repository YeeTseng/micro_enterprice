package com.zy.me.dao;

import com.zy.me.model.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper {

    Users selectByPrimaryKey(String id);

    void deleteByPrimaryKey(String id);

    void insert(Users users);

    void insertSelective(Users users);

    void updateByPrimaryKeySelective(Users users);

    void updateByPrimaryKey(Users users);

}