package com.neusoft.his.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.his.mapper.ConstanttypeMapper;
import com.neusoft.his.pojo.Constanttype;
import com.neusoft.his.service.ConstantTypeService;

@Service
public class ConstantTypeServiceImpl implements ConstantTypeService{
	
	@Autowired
	private ConstanttypeMapper constanttypeMapper;
	
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return constanttypeMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public int insert(Constanttype record) {
		return constanttypeMapper.insert(record);
	}
	
	@Override
	public int insertSelective(Constanttype record) {
		return constanttypeMapper.insertSelective(record);
	}
	
	@Override
	public Constanttype selectByPrimaryKey(Integer id) {
		return constanttypeMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int updateByPrimaryKey(Constanttype record) {
		return constanttypeMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public int updateByPrimaryKeySelective(Constanttype record) {
		return constanttypeMapper.updateByPrimaryKeySelective(record);
	}
	
	@Override
	public int selectByCount(Constanttype record) {
		return constanttypeMapper.selectByCount(record);
	}
	
	@Override
	public List<Constanttype> selectAll(Constanttype record) {
		return constanttypeMapper.selectAll(record);
	}
}
