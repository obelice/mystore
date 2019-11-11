package com.neusoft.his.service;

import com.neusoft.his.pojo.Herbaltemplate;

public interface HerbaltemplateService {
    int deleteByPrimaryKey(Integer id);

    int insert(Herbaltemplate record);

    int insertSelective(Herbaltemplate record);

    Herbaltemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Herbaltemplate record);

    int updateByPrimaryKey(Herbaltemplate record);
}