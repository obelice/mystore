package com.neusoft.his.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Register;

@Mapper
public interface RegisterMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Register record);

	int insertSelective(Register record);

	List<Register> selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Register record);

	int updateByPrimaryKey(Register record);
}