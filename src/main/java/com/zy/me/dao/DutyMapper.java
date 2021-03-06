package com.zy.me.dao;

import com.zy.me.model.Duty;
import org.springframework.stereotype.Repository;

@Repository
public interface DutyMapper {
    int deleteByPrimaryKey(String dutyId);

    int insert(Duty record);

    int insertSelective(Duty record);

    Duty selectByPrimaryKey(String dutyId);

    int updateByPrimaryKeySelective(Duty record);

    int updateByPrimaryKey(Duty record);
}