package com.zgld.api.beans;

/**
 * AbstractSupperArea entity provides the base persistence definition of the
 * SupperArea entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSupperArea implements java.io.Serializable {

	// Fields
	private Integer userid;
	private Integer areaid;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getAreaid() {
		return areaid;
	}
	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}
	

}