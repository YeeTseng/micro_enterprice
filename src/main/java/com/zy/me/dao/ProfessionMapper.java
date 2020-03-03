package com.zy.me.dao;

import com.zy.me.model.Profession;

public interface ProfessionMapper {
    int deleteByPrimaryKey(String professionCode);

    int insert(Profession record);

    int insertSelective(Profession record);

    Profession selectByPrimaryKey(String professionCode);

    int updateByPrimaryKeySelective(Profession record);

    int updateByPrimaryKeyWithBLOBs(Profession record);

    int updateByPrimaryKey(Profession record);
}