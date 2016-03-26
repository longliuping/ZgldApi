package com.zgld.api.beans;

/**
 * AbstractHishopProductTypeBrands entity provides the base persistence
 * definition of the HishopProductTypeBrands entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopProductTypeBrands implements java.io.Serializable {

	// Fields

	private HishopProductTypeBrandsId id;

	// Constructors

	/** default constructor */
	public AbstractHishopProductTypeBrands() {
	}

	/** full constructor */
	public AbstractHishopProductTypeBrands(HishopProductTypeBrandsId id) {
		this.id = id;
	}

	// Property accessors

	public HishopProductTypeBrandsId getId() {
		return this.id;
	}

	public void setId(HishopProductTypeBrandsId id) {
		this.id = id;
	}

}