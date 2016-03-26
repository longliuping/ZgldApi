package com.zgld.api.beans;

/**
 * AbstractSupperHot entity provides the base persistence definition of the
 * SupperHot entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSupperHot implements java.io.Serializable {

	// Fields

	private Integer userid;
	private Integer hotid;

	// Constructors

	/** default constructor */
	public AbstractSupperHot() {
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getHotid() {
		return this.hotid;
	}

	public void setHotid(Integer hotid) {
		this.hotid = hotid;
	}

}