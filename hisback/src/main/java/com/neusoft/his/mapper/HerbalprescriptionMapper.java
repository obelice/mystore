package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Herbalprescription;
@Mapper
public interface HerbalprescriptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Herbalprescription record);

    int insertSelective(Herbalprescription record);

    Herbalprescription selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Herbalprescription record);

    int updateByPrimaryKey(Herbalprescription record);
}