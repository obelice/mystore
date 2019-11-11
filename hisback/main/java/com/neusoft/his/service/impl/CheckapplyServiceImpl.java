package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.CheckapplyMapper;
import com.neusoft.his.pojo.Checkapply;
import com.neusoft.his.service.CheckapplyService;

@Service
public class CheckapplyServiceImpl implements CheckapplyService {

	@Autowired
	private CheckapplyMapper checkapplyMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Checkapply record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Checkapply record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Checkapply selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Checkapply record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Checkapply record) {
		// TODO Auto-generated method stub
		return 0;
	}

}