package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Medicaldisease;
@Mapper
public interface MedicaldiseaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Medicaldisease record);

    int insertSelective(Medicaldisease record);

    Medicaldisease selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Medicaldisease record);

    int updateByPrimaryKey(Medicaldisease record);
}