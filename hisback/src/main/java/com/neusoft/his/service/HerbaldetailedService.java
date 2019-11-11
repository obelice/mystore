package com.neusoft.his.service;

import com.neusoft.his.pojo.Herbaldetailed;

public interface HerbaldetailedService {
    int deleteByPrimaryKey(Integer id);

    int insert(Herbaldetailed record);

    int insertSelective(Herbaldetailed record);

    Herbaldetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Herbaldetailed record);

    int updateByPrimaryKey(Herbaldetailed record);
}