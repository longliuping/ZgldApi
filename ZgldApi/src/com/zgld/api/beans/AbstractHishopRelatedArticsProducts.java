package com.zgld.api.beans;

/**
 * AbstractHishopRelatedArticsProducts entity provides the base persistence
 * definition of the HishopRelatedArticsProducts entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopRelatedArticsProducts implements
		java.io.Serializable {

	// Fields

	private HishopRelatedArticsProductsId id;

	// Constructors

	/** default constructor */
	public AbstractHishopRelatedArticsProducts() {
	}

	/** full constructor */
	public AbstractHishopRelatedArticsProducts(HishopRelatedArticsProductsId id) {
		this.id = id;
	}

	// Property accessors

	public HishopRelatedArticsProductsId getId() {
		return this.id;
	}

	public void setId(HishopRelatedArticsProductsId id) {
		this.id = id;
	}

}