package com.neusoft.his.service;

import com.neusoft.his.pojo.Patientcosts;

public interface PatientcostsService {
    int deleteByPrimaryKey(Integer id);

    int insert(Patientcosts record);

    int insertSelective(Patientcosts record);

    Patientcosts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Patientcosts record);

    int updateByPrimaryKey(Patientcosts record);
}