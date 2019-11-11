package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.InvoiceMapper;
import com.neusoft.his.pojo.Invoice;
import com.neusoft.his.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceMapper invoiceMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Invoice record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Invoice record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Invoice selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Invoice record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Invoice record) {
		// TODO Auto-generated method stub
		return 0;
	}

}