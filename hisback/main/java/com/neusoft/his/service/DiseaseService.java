package com.neusoft.his.service;

import java.util.List;

import com.neusoft.his.pojo.Disease;

public interface DiseaseService {
	int deleteByPrimaryKey(Integer id);

//批量删除
	int deleteBybatch(List<Disease> record);

	int insert(Disease record);

	int insertSelective(Disease record);

	Disease selectByPrimaryKey(Integer id);

	// 待条件查询总行数
	int selectByCount(Disease disease);

	// <!-- 带条件疾病类别和编号 查询-->
	List<Disease> selectAllByConditions(Disease disease);

	int updateByPrimaryKeySelective(Disease record);

	int updateByPrimaryKey(Disease record);
}