package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.DrugsdetailedMapper;
import com.neusoft.his.pojo.Drugsdetailed;
import com.neusoft.his.service.DrugsdetailedService;

@Service
public class DrugsdetailedServiceImpl implements DrugsdetailedService {

	@Autowired
	private DrugsdetailedMapper drugsdetailedMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Drugsdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Drugsdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Drugsdetailed selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Drugsdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Drugsdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

}