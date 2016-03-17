package com.zgld.api.beans;

/**
 * AbstractHishopProductTag entity provides the base persistence definition of
 * the HishopProductTag entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopProductTag implements java.io.Serializable {

	// Fields

	private HishopProductTagId id;

	// Constructors

	/** default constructor */
	public AbstractHishopProductTag() {
	}

	/** full constructor */
	public AbstractHishopProductTag(HishopProductTagId id) {
		this.id = id;
	}

	// Property accessors

	public HishopProductTagId getId() {
		return this.id;
	}

	public void setId(HishopProductTagId id) {
		this.id = id;
	}

}