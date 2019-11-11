package com.neusoft.his.service;

import java.util.List;

import com.neusoft.his.pojo.Registlevel;

public interface RegistlevelService {
	int deleteByPrimaryKey(Integer id);

	int insert(Registlevel record);

	int insertSelective(Registlevel record);

	List<Registlevel> selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Registlevel record);

	int updateByPrimaryKey(Registlevel record);
}