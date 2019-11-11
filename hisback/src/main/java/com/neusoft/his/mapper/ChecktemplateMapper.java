package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Checktemplate;

@Mapper
public interface ChecktemplateMapper {
	public int deleteByPrimaryKey(Integer id);

	public int insert(Checktemplate record);

	public int insertSelective(Checktemplate record);

	public Checktemplate selectByPrimaryKey(Integer id);

	public int updateByPrimaryKeySelective(Checktemplate record);

	public int updateByPrimaryKey(Checktemplate record);
}