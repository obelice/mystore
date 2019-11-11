package com.neusoft.his.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.DisecategoryMapper;
import com.neusoft.his.pojo.Disecategory;
import com.neusoft.his.service.DisecategoryService;

@Service
public class DisecategoryServiceImpl implements DisecategoryService {
	@Autowired
	private DisecategoryMapper disecategoryMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return disecategoryMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Disecategory record) {
		return disecategoryMapper.insert(record);
	}

	@Override
	public int insertSelective(Disecategory record) {
		return disecategoryMapper.insertSelective(record);
	}

	@Override
	public // 待条件查询总行数
	int selectByCount(Disecategory disecategory) {
		return disecategoryMapper.selectByCount(disecategory);
	}

	@Override
	public int updateByPrimaryKeySelective(Disecategory record) {
		return disecategoryMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Disecategory record) {
		return disecategoryMapper.updateByPrimaryKey(record);
	}

	// <!-- 带条件疾病类别和编号 查询-->
	@Override
	public List<Disecategory> selectAllByConditions(Disecategory disecategory) {
		return disecategoryMapper.selectAllByConditions(disecategory);
	}

	@Override
	public int deleteBybatch(List<Disecategory> record) {
		// TODO Auto-generated method stub
		return disecategoryMapper.deleteBybatch(record);
	}

}