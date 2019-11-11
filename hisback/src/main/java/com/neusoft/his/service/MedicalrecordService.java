package com.neusoft.his.service;

import com.neusoft.his.pojo.Medicalrecord;

public interface MedicalrecordService {
    int deleteByPrimaryKey(Integer id);

    int insert(Medicalrecord record);

    int insertSelective(Medicalrecord record);

    Medicalrecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Medicalrecord record);

    int updateByPrimaryKey(Medicalrecord record);
}