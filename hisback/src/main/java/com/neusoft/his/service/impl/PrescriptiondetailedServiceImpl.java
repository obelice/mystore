package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.PrescriptiondetailedMapper;
import com.neusoft.his.pojo.Prescriptiondetailed;
import com.neusoft.his.service.PrescriptiondetailedService;

@Service
public class PrescriptiondetailedServiceImpl implements PrescriptiondetailedService {

	@Autowired
	private PrescriptiondetailedMapper prescriptiondetailedMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Prescriptiondetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Prescriptiondetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Prescriptiondetailed selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Prescriptiondetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Prescriptiondetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

}