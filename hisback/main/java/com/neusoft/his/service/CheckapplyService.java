package com.neusoft.his.service;

import com.neusoft.his.pojo.Checkapply;

public interface CheckapplyService {
    int deleteByPrimaryKey(Integer id);

    int insert(Checkapply record);

    int insertSelective(Checkapply record);

    Checkapply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Checkapply record);

    int updateByPrimaryKey(Checkapply record);
}