package com.neusoft.his.service;

import com.neusoft.his.pojo.Drugs;

public interface DrugsService {
    int deleteByPrimaryKey(Integer id);

    int insert(Drugs record);

    int insertSelective(Drugs record);

    Drugs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drugs record);

    int updateByPrimaryKey(Drugs record);
}