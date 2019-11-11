package com.neusoft.his.service;

import java.util.List;

import com.neusoft.his.pojo.Register;

public interface RegisterService {
	int deleteByPrimaryKey(Integer id);

	int insert(Register record);

	int insertSelective(Register record);

	List<Register> selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Register record);

	int updateByPrimaryKey(Register record);
}