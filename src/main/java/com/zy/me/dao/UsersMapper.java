package com.zy.me.dao;

import com.zy.me.model.Users;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);
}