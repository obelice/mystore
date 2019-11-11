package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Herbaltemplate;
@Mapper
public interface HerbaltemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Herbaltemplate record);

    int insertSelective(Herbaltemplate record);

    Herbaltemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Herbaltemplate record);

    int updateByPrimaryKey(Herbaltemplate record);
}