package com.neusoft.his.service;

import com.neusoft.his.pojo.Fmeditem;

public interface FmeditemService {
    int deleteByPrimaryKey(Integer id);

    int insert(Fmeditem record);

    int insertSelective(Fmeditem record);

    Fmeditem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fmeditem record);

    int updateByPrimaryKey(Fmeditem record);
}