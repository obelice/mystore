package com.neusoft.his.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.ConstantitemMapper;
import com.neusoft.his.pojo.Constantitem;
import com.neusoft.his.pojo.Constanttype;
import com.neusoft.his.service.ConstantitemService;

@Service
public class ConstantitemServiceImpl implements ConstantitemService {

	@Autowired
	private ConstantitemMapper constantitemMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Constantitem record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Constantitem record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Constantitem selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Constantitem record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Constantitem record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int selectByCount(Constantitem record) {
		return constantitemMapper.selectByCount(record);
	}
	
	@Override
	public List<Constantitem> selectAll(Constantitem record) {
		return constantitemMapper.selectAll(record);
	}
}