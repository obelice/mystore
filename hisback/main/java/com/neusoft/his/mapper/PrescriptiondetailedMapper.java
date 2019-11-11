package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Prescriptiondetailed;
@Mapper
public interface PrescriptiondetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Prescriptiondetailed record);

    int insertSelective(Prescriptiondetailed record);

    Prescriptiondetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Prescriptiondetailed record);

    int updateByPrimaryKey(Prescriptiondetailed record);
}