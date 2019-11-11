package com.neusoft.his.service;

import com.neusoft.his.pojo.Scheduling;

public interface SchedulingService {
    int deleteByPrimaryKey(Integer id);

    int insert(Scheduling record);

    int insertSelective(Scheduling record);

    Scheduling selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Scheduling record);

    int updateByPrimaryKey(Scheduling record);
}