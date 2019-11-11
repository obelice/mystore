package com.neusoft.his.service;

import com.neusoft.his.pojo.Herbaltempdetailed;

public interface HerbaltempdetailedService {
    int deleteByPrimaryKey(Integer id);

    int insert(Herbaltempdetailed record);

    int insertSelective(Herbaltempdetailed record);

    Herbaltempdetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Herbaltempdetailed record);

    int updateByPrimaryKey(Herbaltempdetailed record);
}