package com.neusoft.his.pojo.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.his.pojo.Department;
import com.neusoft.his.pojo.Rule;
import com.neusoft.his.pojo.Scheduling;
import com.neusoft.his.pojo.User;

public class ScheEntity {
	@Autowired
	private Department department;
	@Autowired
	private Scheduling scheduling;
	@Autowired
	private User user;
	@Autowired
	private Rule rule;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Scheduling getScheduling() {
		return scheduling;
	}

	public void setScheduling(Scheduling scheduling) {
		this.scheduling = scheduling;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}
}
