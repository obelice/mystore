package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Checkrelation;
@Mapper
public interface CheckrelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Checkrelation record);

    int insertSelective(Checkrelation record);

    Checkrelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Checkrelation record);

    int updateByPrimaryKey(Checkrelation record);
}