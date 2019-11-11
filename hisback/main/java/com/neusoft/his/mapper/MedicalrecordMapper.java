package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Medicalrecord;
@Mapper
public interface MedicalrecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Medicalrecord record);

    int insertSelective(Medicalrecord record);

    Medicalrecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Medicalrecord record);

    int updateByPrimaryKey(Medicalrecord record);
}