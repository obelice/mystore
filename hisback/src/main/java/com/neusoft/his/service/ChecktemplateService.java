package com.neusoft.his.service;

import com.neusoft.his.pojo.Checktemplate;

public interface ChecktemplateService {
    int deleteByPrimaryKey(Integer id);

    int insert(Checktemplate record);

    int insertSelective(Checktemplate record);

    Checktemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Checktemplate record);

    int updateByPrimaryKey(Checktemplate record);
}