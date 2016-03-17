package com.zgld.api.beans;

/**
 * AbstractHishopPromotionProducts entity provides the base persistence
 * definition of the HishopPromotionProducts entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopPromotionProducts implements
		java.io.Serializable {

	// Fields

	private HishopPromotionProductsId id;

	// Constructors

	/** default constructor */
	public AbstractHishopPromotionProducts() {
	}

	/** full constructor */
	public AbstractHishopPromotionProducts(HishopPromotionProductsId id) {
		this.id = id;
	}

	// Property accessors

	public HishopPromotionProductsId getId() {
		return this.id;
	}

	public void setId(HishopPromotionProductsId id) {
		this.id = id;
	}

}