package com.neusoft.his.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Registlevel;

@Mapper
public interface RegistlevelMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Registlevel record);

	int insertSelective(Registlevel record);

	List<Registlevel> selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Registlevel record);

	int updateByPrimaryKey(Registlevel record);
}