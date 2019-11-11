package com.neusoft.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.pojo.Checkapply;
import com.neusoft.his.service.CheckapplyService;

@RestController
@RequestMapping("/CheckapplyController")
public class CheckapplyController {

	@Autowired
	private CheckapplyService checkapplyService;

	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return checkapplyService.deleteByPrimaryKey(id);
	}

	@RequestMapping("/insert")
	public int insert(Checkapply record) {
		// TODO Auto-generated method stub
		return checkapplyService.insert(record);
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(Checkapply record) {
		// TODO Auto-generated method stub
		return checkapplyService.insertSelective(record);
	}

	@RequestMapping("/selectByPrimaryKey")
	public Checkapply selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return checkapplyService.selectByPrimaryKey(id);
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(Checkapply record) {
		// TODO Auto-generated method stub
		return checkapplyService.updateByPrimaryKeySelective(record);
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(Checkapply record) {
		// TODO Auto-generated method stub
		return checkapplyService.updateByPrimaryKey(record);
	}

}