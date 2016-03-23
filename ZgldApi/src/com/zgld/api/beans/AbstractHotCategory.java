package com.zgld.api.beans;

/**
 * AbstractHotCategory entity provides the base persistence definition of the
 * HotCategory entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHotCategory implements java.io.Serializable {

	// Fields

	private Integer hotid;
	private String hotname;

	// Constructors

	/** default constructor */
	public AbstractHotCategory() {
	}

	/** minimal constructor */
	public AbstractHotCategory(Integer hotid) {
		this.hotid = hotid;
	}

	/** full constructor */
	public AbstractHotCategory(Integer hotid, String hotname) {
		this.hotid = hotid;
		this.hotname = hotname;
	}

	// Property accessors

	public Integer getHotid() {
		return this.hotid;
	}

	public void setHotid(Integer hotid) {
		this.hotid = hotid;
	}

	public String getHotname() {
		return this.hotname;
	}

	public void setHotname(String hotname) {
		this.hotname = hotname;
	}

}