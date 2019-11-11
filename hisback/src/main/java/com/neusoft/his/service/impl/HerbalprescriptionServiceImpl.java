package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.HerbalprescriptionMapper;
import com.neusoft.his.pojo.Herbalprescription;
import com.neusoft.his.service.HerbalprescriptionService;

@Service
public class HerbalprescriptionServiceImpl implements HerbalprescriptionService {

	@Autowired
	private HerbalprescriptionMapper herbalprescriptionMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Herbalprescription record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Herbalprescription record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Herbalprescription selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Herbalprescription record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Herbalprescription record) {
		// TODO Auto-generated method stub
		return 0;
	}

}