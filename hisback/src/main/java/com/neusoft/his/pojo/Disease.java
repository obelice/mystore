package com.neusoft.his.pojo;

public class Disease {
	private Integer id;

	private String diseasecode;

	private String diseasename;

	private String diseaseicd;

	private Integer disecategoryid;

	private Disecategory disecategory;

	public Disecategory getDisecategory() {
		return disecategory;
	}

	public void setDisecategory(Disecategory disecategory) {
		this.disecategory = disecategory;
	}

	private Integer delmark;
	private Integer beginNum;

	private Integer maxNum;

	public Integer getBeginNum() {
		return beginNum;
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

	public String getDiseasecode() {
		return diseasecode;
	}

	public void setDiseasecode(String diseasecode) {
		this.diseasecode = diseasecode == null ? null : diseasecode.trim();
	}

	public String getDiseasename() {
		return diseasename;
	}

	public void setDiseasename(String diseasename) {
		this.diseasename = diseasename == null ? null : diseasename.trim();
	}

	public String getDiseaseicd() {
		return diseaseicd;
	}

	public void setDiseaseicd(String diseaseicd) {
		this.diseaseicd = diseaseicd == null ? null : diseaseicd.trim();
	}

	public Integer getDisecategoryid() {
		return disecategoryid;
	}

	public void setDisecategoryid(Integer disecategoryid) {
		this.disecategoryid = disecategoryid;
	}

	public Integer getDelmark() {
		return delmark;
	}

	public void setDelmark(Integer delmark) {
		this.delmark = delmark;
	}

	@Override
	public String toString() {
		return "Disease [id=" + id + ", diseasecode=" + diseasecode + ", diseasename=" + diseasename + ", diseaseicd="
				+ diseaseicd + ", disecategoryid=" + disecategoryid + ", delmark=" + delmark + ", beginNum=" + beginNum
				+ ", maxNum=" + maxNum + "]";
	}

}