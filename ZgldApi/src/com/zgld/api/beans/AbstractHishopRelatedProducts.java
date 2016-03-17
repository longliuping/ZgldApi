package com.zgld.api.beans;

/**
 * AbstractHishopRelatedProducts entity provides the base persistence definition
 * of the HishopRelatedProducts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopRelatedProducts implements
		java.io.Serializable {

	// Fields

	private HishopRelatedProductsId id;

	// Constructors

	/** default constructor */
	public AbstractHishopRelatedProducts() {
	}

	/** full constructor */
	public AbstractHishopRelatedProducts(HishopRelatedProductsId id) {
		this.id = id;
	}

	// Property accessors

	public HishopRelatedProductsId getId() {
		return this.id;
	}

	public void setId(HishopRelatedProductsId id) {
		this.id = id;
	}

}