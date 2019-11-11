package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Registwork;
@Mapper
public interface RegistworkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Registwork record);

    int insertSelective(Registwork record);

    Registwork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Registwork record);

    int updateByPrimaryKey(Registwork record);
}