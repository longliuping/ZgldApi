package com.zgld.api.beans;

/**
 * AbstractAspnetManagers entity provides the base persistence definition of the
 * AspnetManagers entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAspnetManagers implements java.io.Serializable {

	// Fields

	private Integer userId;

	// Constructors

	/** default constructor */
	public AbstractAspnetManagers() {
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}