package com.zgld.api.beans;

/**
 * AbstractHishopProductAttributes entity provides the base persistence
 * definition of the HishopProductAttributes entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopProductAttributes implements java.io.Serializable {

	// Fields

	private HishopProductAttributesId id;

	// Constructors

	/** default constructor */
	public AbstractHishopProductAttributes() {
	}

	/** full constructor */
	public AbstractHishopProductAttributes(HishopProductAttributesId id) {
		this.id = id;
	}

	// Property accessors

	public HishopProductAttributesId getId() {
		return this.id;
	}

	public void setId(HishopProductAttributesId id) {
		this.id = id;
	}

}