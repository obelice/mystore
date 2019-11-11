package com.neusoft.his.pojo.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.his.pojo.Department;
import com.neusoft.his.pojo.Expenseclass;
import com.neusoft.his.pojo.Fmeditem;

public class FmeditemDepExp {
	@Autowired
	private Fmeditem fmeditem;
	@Autowired
	private Department department;
	@Autowired
	private Expenseclass expenseclass;

	public Fmeditem getFmeditem() {
		return fmeditem;
	}

	public void setFmeditem(Fmeditem fmeditem) {
		this.fmeditem = fmeditem;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Expenseclass getExpenseclass() {
		return expenseclass;
	}

	public void setExpenseclass(Expenseclass expenseclass) {
		this.expenseclass = expenseclass;
	}

}
