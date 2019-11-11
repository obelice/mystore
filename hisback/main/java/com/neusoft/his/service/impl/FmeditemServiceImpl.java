package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.FmeditemMapper;
import com.neusoft.his.pojo.Fmeditem;
import com.neusoft.his.service.FmeditemService;

@Service
public class FmeditemServiceImpl implements FmeditemService {

	@Autowired
	private FmeditemMapper fmeditemMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Fmeditem record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Fmeditem record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Fmeditem selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Fmeditem record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Fmeditem record) {
		// TODO Auto-generated method stub
		return 0;
	}

}