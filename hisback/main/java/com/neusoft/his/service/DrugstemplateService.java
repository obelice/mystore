package com.neusoft.his.service;

import com.neusoft.his.pojo.Drugstemplate;

public interface DrugstemplateService {
    int deleteByPrimaryKey(Integer id);

    int insert(Drugstemplate record);

    int insertSelective(Drugstemplate record);

    Drugstemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drugstemplate record);

    int updateByPrimaryKey(Drugstemplate record);
}