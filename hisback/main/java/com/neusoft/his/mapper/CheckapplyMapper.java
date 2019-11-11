package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Checkapply;

@Mapper
public interface CheckapplyMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Checkapply record);

	int insertSelective(Checkapply record);

	Checkapply selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Checkapply record);

	int updateByPrimaryKey(Checkapply record);
}