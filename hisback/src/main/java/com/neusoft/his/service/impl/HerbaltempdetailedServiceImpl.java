package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.HerbaltempdetailedMapper;
import com.neusoft.his.pojo.Herbaltempdetailed;
import com.neusoft.his.service.HerbaltempdetailedService;

@Service
public class HerbaltempdetailedServiceImpl implements HerbaltempdetailedService {

	@Autowired
	private HerbaltempdetailedMapper herbaltempdetailedMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Herbaltempdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Herbaltempdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Herbaltempdetailed selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Herbaltempdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Herbaltempdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

}