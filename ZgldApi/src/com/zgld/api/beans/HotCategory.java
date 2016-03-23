package com.zgld.api.beans;

/**
 * HotCategory entity. @author MyEclipse Persistence Tools
 */
public class HotCategory extends AbstractHotCategory implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HotCategory() {
	}

	/** minimal constructor */
	public HotCategory(Integer hotid) {
		super(hotid);
	}

	/** full constructor */
	public HotCategory(Integer hotid, String hotname) {
		super(hotid, hotname);
	}

}
