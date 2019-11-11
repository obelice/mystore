package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.SchedulingMapper;
import com.neusoft.his.pojo.Scheduling;
import com.neusoft.his.service.SchedulingService;

@Service
public class SchedulingServiceImpl implements SchedulingService {

	@Autowired
	private SchedulingMapper schedulingMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Scheduling record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Scheduling record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Scheduling selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Scheduling record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Scheduling record) {
		// TODO Auto-generated method stub
		return 0;
	}

}