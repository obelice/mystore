package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Herbaltempdetailed;
@Mapper
public interface HerbaltempdetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Herbaltempdetailed record);

    int insertSelective(Herbaltempdetailed record);

    Herbaltempdetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Herbaltempdetailed record);

    int updateByPrimaryKey(Herbaltempdetailed record);
}