package com.neusoft.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.pojo.Medicaldisease;
import com.neusoft.his.service.MedicaldiseaseService;
@RestController
@RequestMapping("/MedicaldiseaseController")
public class MedicaldiseaseController {

	@Autowired
	private MedicaldiseaseService medicaldiseaseService;
	
	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insert")
	public int insert(Medicaldisease record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(Medicaldisease record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/selectByPrimaryKey")
	public Medicaldisease selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(Medicaldisease record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(Medicaldisease record) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}