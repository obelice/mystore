package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.HerbaldetailedMapper;
import com.neusoft.his.pojo.Herbaldetailed;
import com.neusoft.his.service.HerbaldetailedService;

@Service
public class HerbaldetailedServiceImpl implements HerbaldetailedService {

	@Autowired
	private HerbaldetailedMapper herbaldetailedMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Herbaldetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Herbaldetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Herbaldetailed selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Herbaldetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Herbaldetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

}