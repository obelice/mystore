package com.neusoft.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.his.pojo.Settlecategory;
import com.neusoft.his.service.SettlecategoryService;

@RestController
@RequestMapping("/Settlecategory")
public class SettlecategoryController {

	@Autowired
	private SettlecategoryService settlecategoryService;

	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(@RequestBody Settlecategory record) {

		return settlecategoryService.deleteByPrimaryKey(record.getId());
	}

	@RequestMapping("/insert")
	public int insert(@RequestBody Settlecategory record) {

		return settlecategoryService.insert(record);
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(@RequestBody Settlecategory record) {

		return settlecategoryService.insertSelective(record);
	}

	@RequestMapping("/selectByPrimaryKey")
	public Settlecategory selectByPrimaryKey(@RequestBody Integer id) {

		return settlecategoryService.selectByPrimaryKey(id);
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(@RequestBody Settlecategory record) {

		return settlecategoryService.updateByPrimaryKeySelective(record);
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(@RequestBody Settlecategory record) {

		return settlecategoryService.updateByPrimaryKey(record);
	}

	@RequestMapping("/deleteBybatch")
	public int deleteBybatch(@RequestBody List<Settlecategory> record) {

		return settlecategoryService.deleteBybatch(record);
	}

	@RequestMapping("/selectByCount")
	public int selectByCount(@RequestBody Settlecategory record) {

		return settlecategoryService.selectByCount(record);
	}

	@RequestMapping("/selectAllByConditions")
	public List<Settlecategory> selectAllByConditions(@RequestBody Settlecategory record) {
		PageHelper.startPage(record.getBeginNum(), record.getMaxNum());
		List<Settlecategory> list = settlecategoryService.selectAllByConditions(record);
		PageInfo<Settlecategory> Settlecategory = new PageInfo(list);
		return Settlecategory.getList();
	}

}