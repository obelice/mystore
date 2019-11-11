package com.neusoft.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.pojo.Department;
import com.neusoft.his.service.DepartmentService;

@RestController
@RequestMapping("/Department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insert")
	public int insert(Department record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(Department record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/selectByPrimaryKey")
	public List<Department> selectByPrimaryKey(@RequestBody Department department) {
		// TODO Auto-generated method stub
		return departmentService.selectByPrimaryKey(department.getId());
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(Department record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(Department record) {
		// TODO Auto-generated method stub
		return 0;
	}

}