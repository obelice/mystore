package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Fmeditem;
@Mapper
public interface FmeditemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fmeditem record);

    int insertSelective(Fmeditem record);

    Fmeditem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fmeditem record);

    int updateByPrimaryKey(Fmeditem record);
}