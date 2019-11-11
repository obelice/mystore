package com.neusoft.his.service;

import com.neusoft.his.pojo.Drugsdetailed;

public interface DrugsdetailedService {
    int deleteByPrimaryKey(Integer id);

    int insert(Drugsdetailed record);

    int insertSelective(Drugsdetailed record);

    Drugsdetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drugsdetailed record);

    int updateByPrimaryKey(Drugsdetailed record);
}