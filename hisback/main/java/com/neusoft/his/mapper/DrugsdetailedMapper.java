package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Drugsdetailed;
@Mapper
public interface DrugsdetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Drugsdetailed record);

    int insertSelective(Drugsdetailed record);

    Drugsdetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drugsdetailed record);

    int updateByPrimaryKey(Drugsdetailed record);
}