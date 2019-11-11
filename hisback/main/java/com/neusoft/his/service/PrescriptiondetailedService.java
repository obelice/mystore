package com.neusoft.his.service;

import com.neusoft.his.pojo.Prescriptiondetailed;

public interface PrescriptiondetailedService {
    int deleteByPrimaryKey(Integer id);

    int insert(Prescriptiondetailed record);

    int insertSelective(Prescriptiondetailed record);

    Prescriptiondetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Prescriptiondetailed record);

    int updateByPrimaryKey(Prescriptiondetailed record);
}