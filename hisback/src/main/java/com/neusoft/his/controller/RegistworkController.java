package com.neusoft.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.pojo.Registwork;
import com.neusoft.his.service.RegistworkService;
@RestController
@RequestMapping("/RegistworkController")
public class RegistworkController {

	@Autowired
	private RegistworkService registworkService;
	
	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insert")
	public int insert(Registwork record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(Registwork record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/selectByPrimaryKey")
	public Registwork selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(Registwork record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(Registwork record) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}