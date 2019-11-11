package com.neusoft.his.service;

import java.util.List;

import com.neusoft.his.pojo.User;

public interface UserService {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByPrimaryKey(User record);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}