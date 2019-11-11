package com.neusoft.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.his.pojo.Disease;
import com.neusoft.his.service.DiseaseService;

@RestController
public class DiseaseController {

	@Autowired
	private DiseaseService diseaseService;

	@RequestMapping("/Disease/deleteByPrimaryKey")
	public int deleteByPrimaryKey(@RequestBody Disease record) {

		return diseaseService.deleteByPrimaryKey(record.getId());
	}

	@RequestMapping("/Disease/deleteBybatch")
	public int deleteBybatch(@RequestBody List<Disease> record) {

		return diseaseService.deleteBybatch(record);
	}

	@RequestMapping("/Disease/insert")
	public int insert(@RequestBody Disease record) {
		// TODO Auto-generated method stub
		return diseaseService.insert(record);
	}

	@RequestMapping("/Disease/insertSelective")
	public int insertSelective(@RequestBody Disease record) {
		// TODO Auto-generated method stub
		return diseaseService.insertSelective(record);
	}

	@RequestMapping("/Disease/selectByPrimaryKey")
	public Disease selectByPrimaryKey(@RequestBody Integer id) {
		// TODO Auto-generated method stub
		return diseaseService.selectByPrimaryKey(id);
	}

	@RequestMapping("/Disease/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(@RequestBody Disease record) {
		System.out.println(record);
		return diseaseService.updateByPrimaryKeySelective(record);
	}

	@RequestMapping("/Disease/updateByPrimaryKey")
	public int updateByPrimaryKey(@RequestBody Disease record) {
		// TODO Auto-generated method stub
		return diseaseService.updateByPrimaryKey(record);
	}

	@RequestMapping("/Disease/selectByCount")
	public int selectByCount( Disease disease) {
		return diseaseService.selectByCount(disease);
	}

	@RequestMapping("/Disease/selectAllByConditions")
	public List<Disease> selectAllByConditions(@RequestBody Disease disease) {
		PageHelper.startPage(disease.getBeginNum(), disease.getMaxNum());
		List<Disease> list = diseaseService.selectAllByConditions(disease);
		PageInfo<Disease> DiseaseInfo = new PageInfo(list);
		return DiseaseInfo.getList();
	}

}