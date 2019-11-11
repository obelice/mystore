package com.neusoft.his.service;

import com.neusoft.his.pojo.Medicaldisease;

public interface MedicaldiseaseService {
    int deleteByPrimaryKey(Integer id);

    int insert(Medicaldisease record);

    int insertSelective(Medicaldisease record);

    Medicaldisease selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Medicaldisease record);

    int updateByPrimaryKey(Medicaldisease record);
}