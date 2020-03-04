package com.zy.me.service.impl;

import com.zy.me.dao.UsersMapper;
import com.zy.me.model.Users;
import com.zy.me.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired UsersMapper usersMapper;

    @Override
    public Users selectByPrimaryKey(String id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteByPrimaryKey(String id) {
        usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(Users users) {
        usersMapper.insert(users);
    }

    @Override
    public void insertSelective(Users users) {
        usersMapper.insertSelective(users);
    }

    @Override
    public void updateByPrimaryKeySelective(Users users) {
        usersMapper.updateByPrimaryKeySelective(users);
    }

    @Override
    public void updateByPrimaryKey(Users users) {
        usersMapper.updateByPrimaryKey(users);
    }
}
