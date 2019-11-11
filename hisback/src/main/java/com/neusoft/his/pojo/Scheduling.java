package com.neusoft.his.pojo;

import java.util.Date;

public class Scheduling {

	private Integer id;

	private Date scheddate;

	private Integer deptid;

	private Integer userid;

	private String noon;

	private Integer ruleid;

	private Integer delmark;

	private Integer beginNum;

	private Integer maxNum;

	private String startDate;

	private String endDate;

	public Integer getBeginNum() {
		return beginNum;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setBeginNum(Integer beginNum) {
		this.beginNum = beginNum;
	}

	public Integer getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(Integer maxNum) {
		this.maxNum = maxNum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getScheddate() {
		return scheddate;
	}

	public void setScheddate(Date scheddate) {
		this.scheddate = scheddate;
	}

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getNoon() {
		return noon;
	}

	public void setNoon(String noon) {
		this.noon = noon == null ? null : noon.trim();
	}

	public Integer getRuleid() {
		return ruleid;
	}

	public void setRuleid(Integer ruleid) {
		this.ruleid = ruleid;
	}

	public Integer getDelmark() {
		return delmark;
	}

	public void setDelmark(Integer delmark) {
		this.delmark = delmark;
	}

	@Override
	public String toString() {
		return "Scheduling [id=" + id + ", scheddate=" + scheddate + ", deptid=" + deptid + ", userid=" + userid
				+ ", noon=" + noon + ", ruleid=" + ruleid + ", delmark=" + delmark + ", beginNum=" + beginNum
				+ ", maxNum=" + maxNum + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

}