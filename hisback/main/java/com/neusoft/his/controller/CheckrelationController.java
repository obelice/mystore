package com.neusoft.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.pojo.Checkrelation;
import com.neusoft.his.service.CheckrelationService;

@RestController
@RequestMapping("/CheckrelationController")
public class CheckrelationController {

	@Autowired
	private CheckrelationService checkrelationService;

	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(Integer id) {
		return checkrelationService.deleteByPrimaryKey(id);
	}

	@RequestMapping("/insert")
	public int insert(Checkrelation record) {
		// TODO Auto-generated method stub
		return checkrelationService.insert(record);
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(Checkrelation record) {
		// TODO Auto-generated method stub
		return checkrelationService.insertSelective(record);
	}

	@RequestMapping("/selectByPrimaryKey")
	public Checkrelation selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return checkrelationService.selectByPrimaryKey(id);
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(Checkrelation record) {
		// TODO Auto-generated method stub
		return checkrelationService.updateByPrimaryKeySelective(record);
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(Checkrelation record) {
		// TODO Auto-generated method stub
		return checkrelationService.updateByPrimaryKey(record);
	}

}