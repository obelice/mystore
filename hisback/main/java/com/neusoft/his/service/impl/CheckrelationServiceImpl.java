package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.CheckrelationMapper;
import com.neusoft.his.pojo.Checkrelation;
import com.neusoft.his.service.CheckrelationService;

@Service
public class CheckrelationServiceImpl implements CheckrelationService {

	@Autowired
	private CheckrelationMapper checkrelationMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Checkrelation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Checkrelation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Checkrelation selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Checkrelation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Checkrelation record) {
		// TODO Auto-generated method stub
		return 0;
	}

}