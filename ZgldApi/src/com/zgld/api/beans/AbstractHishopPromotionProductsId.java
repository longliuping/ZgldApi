package com.zgld.api.beans;

/**
 * AbstractHishopPromotionProductsId entity provides the base persistence
 * definition of the HishopPromotionProductsId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopPromotionProductsId implements java.io.Serializable {

	// Fields

	private HishopPromotions hishopPromotions;
	private HishopProducts hishopProducts;

	// Constructors

	/** default constructor */
	public AbstractHishopPromotionProductsId() {
	}

	/** full constructor */
	public AbstractHishopPromotionProductsId(HishopPromotions hishopPromotions, HishopProducts hishopProducts) {
		this.hishopPromotions = hishopPromotions;
		this.hishopProducts = hishopProducts;
	}

	// Property accessors

	public HishopPromotions getHishopPromotions() {
		return this.hishopPromotions;
	}

	public void setHishopPromotions(HishopPromotions hishopPromotions) {
		this.hishopPromotions = hishopPromotions;
	}

	public HishopProducts getHishopProducts() {
		return this.hishopProducts;
	}

	public void setHishopProducts(HishopProducts hishopProducts) {
		this.hishopProducts = hishopProducts;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopPromotionProductsId))
			return false;
		AbstractHishopPromotionProductsId castOther = (AbstractHishopPromotionProductsId) other;

		return ((this.getHishopPromotions() == castOther.getHishopPromotions()) || (this.getHishopPromotions() != null && castOther.getHishopPromotions() != null && this.getHishopPromotions().equals(castOther.getHishopPromotions()))) && ((this.getHishopProducts() == castOther.getHishopProducts()) || (this.getHishopProducts() != null && castOther.getHishopProducts() != null && this.getHishopProducts().equals(castOther.getHishopProducts())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHishopPromotions() == null ? 0 : this.getHishopPromotions().hashCode());
		result = 37 * result + (getHishopProducts() == null ? 0 : this.getHishopProducts().hashCode());
		return result;
	}

}