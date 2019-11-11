package com.neusoft.his.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Department;

@Mapper
public interface DepartmentMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Department record);

	int insertSelective(Department record);

	List<Department> selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Department record);

	int updateByPrimaryKey(Department record);
}