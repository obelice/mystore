package com.neusoft.his.pojo;

public class Disecategory {
	private Integer id;

	private String dicacode;

	private String dicaname;

	private Integer sequenceno;

	private Integer dicatype;

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

	public String getDicacode() {
		return dicacode;
	}

	public void setDicacode(String dicacode) {
		this.dicacode = dicacode == null ? null : dicacode.trim();
	}

	public String getDicaname() {
		return dicaname;
	}

	public void setDicaname(String dicaname) {
		this.dicaname = dicaname == null ? null : dicaname.trim();
	}

	public Integer getSequenceno() {
		return sequenceno;
	}

	public void setSequenceno(Integer sequenceno) {
		this.sequenceno = sequenceno;
	}

	public Integer getDicatype() {
		return dicatype;
	}

	public void setDicatype(Integer dicatype) {
		this.dicatype = dicatype;
	}

	public Integer getDelmark() {
		return delmark;
	}

	public void setDelmark(Integer delmark) {
		this.delmark = delmark;
	}

	@Override
	public String toString() {
		return "Disecategory [id=" + id + ", dicacode=" + dicacode + ", dicaname=" + dicaname + ", sequenceno="
				+ sequenceno + ", dicatype=" + dicatype + ", delmark=" + delmark + ", beginNum=" + beginNum
				+ ", maxNum=" + maxNum + "]";
	}

}