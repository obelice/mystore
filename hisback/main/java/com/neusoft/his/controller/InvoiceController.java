package com.neusoft.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.pojo.Invoice;
import com.neusoft.his.service.InvoiceService;
@RestController
@RequestMapping("/InvoiceController")
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;
	
	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insert")
	public int insert(Invoice record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(Invoice record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/selectByPrimaryKey")
	public Invoice selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(Invoice record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(Invoice record) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}