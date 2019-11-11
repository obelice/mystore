package com.neusoft.his.service;

import java.util.List;

import com.neusoft.his.pojo.Department;

public interface DepartmentService {
	int deleteByPrimaryKey(Integer id);

	int insert(Department record);

	int insertSelective(Department record);

	List<Department> selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Department record);

	int updateByPrimaryKey(Department record);
}