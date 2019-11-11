package com.neusoft.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.pojo.Herbaltempdetailed;
import com.neusoft.his.service.HerbaltempdetailedService;
@RestController
@RequestMapping("/HerbaltempdetailedService")
public class HerbaltempdetailedController {

	@Autowired
	private HerbaltempdetailedService herbaltempdetailedService;
	
	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insert")
	public int insert(Herbaltempdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(Herbaltempdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/selectByPrimaryKey")
	public Herbaltempdetailed selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(Herbaltempdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(Herbaltempdetailed record) {
		// TODO Auto-generated method stub
		return 0;
	}
   
}