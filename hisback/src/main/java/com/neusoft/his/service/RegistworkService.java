package com.neusoft.his.service;

import com.neusoft.his.pojo.Registwork;

public interface RegistworkService {
    int deleteByPrimaryKey(Integer id);

    int insert(Registwork record);

    int insertSelective(Registwork record);

    Registwork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Registwork record);

    int updateByPrimaryKey(Registwork record);
}