package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Herbaldetailed;
@Mapper
public interface HerbaldetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Herbaldetailed record);

    int insertSelective(Herbaldetailed record);

    Herbaldetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Herbaldetailed record);

    int updateByPrimaryKey(Herbaldetailed record);
}