package com.neusoft.his.service;

import com.neusoft.his.pojo.Herbalprescription;

public interface HerbalprescriptionService {
    int deleteByPrimaryKey(Integer id);

    int insert(Herbalprescription record);

    int insertSelective(Herbalprescription record);

    Herbalprescription selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Herbalprescription record);

    int updateByPrimaryKey(Herbalprescription record);
}