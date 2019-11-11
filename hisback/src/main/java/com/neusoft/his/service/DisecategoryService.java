package com.neusoft.his.service;

import java.util.List;

import com.neusoft.his.pojo.Disecategory;

public interface DisecategoryService {
	int deleteByPrimaryKey(Integer id);

	int deleteBybatch(List<Disecategory> record);

	int insert(Disecategory record);

	int insertSelective(Disecategory record);

	// 待条件查询总行数
	int selectByCount(Disecategory disecategory);

	// <!-- 带条件疾病类别和编号 查询-->
	List<Disecategory> selectAllByConditions(Disecategory disecategory);

	int updateByPrimaryKeySelective(Disecategory record);

	int updateByPrimaryKey(Disecategory record);
}