package com.zy.me.service;

import com.zy.me.model.Users;

import java.util.Map;

/**
 * @author Administrator
 */
public interface UserService {

    /**
     * 主键查询
     * @param id - 主键
     * @return Users
     */
    Users selectByPrimaryKey(String id);

    /**
     * 主键删除
     * @param id
     */
    void deleteByPrimaryKey(String id);

    /**
     * 插入
     * @param users - 用户对象
     */
    void insert(Users users);

    /**
     * 选择插入
     * @param users - 用户对象
     */
    void insertSelective(Users users);

    /**
     * 主键修改
     * @param users - 用户对象
     */
    void updateByPrimaryKeySelective(Users users);

    /**
     * 逐渐修改
     * @param users
     */
    void updateByPrimaryKey(Users users);

    /**
     * 用户名查询
     * @param map - map中传入用户名
     * @return Users
     */
    Users selectByUsername(Map<String,Object> map);
}
