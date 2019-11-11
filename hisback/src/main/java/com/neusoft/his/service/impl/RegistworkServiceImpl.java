package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.RegistworkMapper;
import com.neusoft.his.pojo.Registwork;
import com.neusoft.his.service.RegistworkService;

@Service
public class RegistworkServiceImpl implements RegistworkService {

	@Autowired
	private RegistworkMapper registworkMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Registwork record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Registwork record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Registwork selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Registwork record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Registwork record) {
		// TODO Auto-generated method stub
		return 0;
	}

}