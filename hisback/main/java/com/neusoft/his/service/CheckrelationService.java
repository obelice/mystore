package com.neusoft.his.service;

import com.neusoft.his.pojo.Checkrelation;

public interface CheckrelationService {
    int deleteByPrimaryKey(Integer id);

    int insert(Checkrelation record);

    int insertSelective(Checkrelation record);

    Checkrelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Checkrelation record);

    int updateByPrimaryKey(Checkrelation record);
}