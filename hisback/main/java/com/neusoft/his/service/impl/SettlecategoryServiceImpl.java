package com.neusoft.his.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.SettlecategoryMapper;
import com.neusoft.his.pojo.Settlecategory;
import com.neusoft.his.service.SettlecategoryService;

@Service
public class SettlecategoryServiceImpl implements SettlecategoryService {

	@Autowired
	private SettlecategoryMapper settlecategoryMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return settlecategoryMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Settlecategory record) {
		// TODO Auto-generated method stub
		return settlecategoryMapper.insert(record);
	}

	@Override
	public int insertSelective(Settlecategory record) {
		// TODO Auto-generated method stub
		return settlecategoryMapper.insertSelective(record);
	}

	@Override
	public Settlecategory selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return settlecategoryMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Settlecategory record) {
		// TODO Auto-generated method stub
		return settlecategoryMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Settlecategory record) {
		// TODO Auto-generated method stub
		return settlecategoryMapper.updateByPrimaryKey(record);
	}

	@Override
	public int deleteBybatch(List<Settlecategory> record) {
		// TODO Auto-generated method stub
		return settlecategoryMapper.deleteBybatch(record);
	}

	@Override
	public int selectByCount(Settlecategory record) {
		// TODO Auto-generated method stub
		return settlecategoryMapper.selectByCount(record);
	}

	@Override
	public List<Settlecategory> selectAllByConditions(Settlecategory record) {
		// TODO Auto-generated method stub
		return settlecategoryMapper.selectAllByConditions(record);
	}

}