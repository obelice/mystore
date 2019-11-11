package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Drugstemplate;
@Mapper
public interface DrugstemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Drugstemplate record);

    int insertSelective(Drugstemplate record);

    Drugstemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drugstemplate record);

    int updateByPrimaryKey(Drugstemplate record);
}