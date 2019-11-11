package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Patientcosts;
@Mapper
public interface PatientcostsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Patientcosts record);

    int insertSelective(Patientcosts record);

    Patientcosts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Patientcosts record);

    int updateByPrimaryKey(Patientcosts record);
}