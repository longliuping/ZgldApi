package com.zgld.api.beans;

/**
 * AbstractSupperArea entity provides the base persistence definition of the
 * SupperArea entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSupperArea implements java.io.Serializable {

	// Fields

	private SupperAreaId id;

	// Constructors

	/** default constructor */
	public AbstractSupperArea() {
	}

	/** full constructor */
	public AbstractSupperArea(SupperAreaId id) {
		this.id = id;
	}

	// Property accessors

	public SupperAreaId getId() {
		return this.id;
	}

	public void setId(SupperAreaId id) {
		this.id = id;
	}

}