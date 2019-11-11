package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.RegisterMapper;
import com.neusoft.his.pojo.Register;
import com.neusoft.his.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterMapper registerMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Register record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Register record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Register selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Register record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Register record) {
		// TODO Auto-generated method stub
		return 0;
	}

}