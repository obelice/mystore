package com.neusoft.his.service;

import java.util.List;

import com.neusoft.his.pojo.Fmeditem;
import com.neusoft.his.pojo.dto.FmeditemDepExp;

public interface FmeditemService {
	int deleteByPrimaryKey(Integer id);

	int insert(Fmeditem record);

	int insertSelective(Fmeditem record);

	Fmeditem selectByPrimaryKey(Integer id);

	List<FmeditemDepExp> selectAllByConditions(Fmeditem record);

	int deleteBybatch(List<Fmeditem> record);

	int selectByCount(Fmeditem record);

	int updateByPrimaryKeySelective(Fmeditem record);

	int updateByPrimaryKey(Fmeditem record);
}