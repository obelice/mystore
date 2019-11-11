package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.PrescriptionMapper;
import com.neusoft.his.pojo.Prescription;
import com.neusoft.his.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	private PrescriptionMapper prescriptionMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Prescription record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Prescription record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Prescription selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Prescription record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Prescription record) {
		// TODO Auto-generated method stub
		return 0;
	}

}