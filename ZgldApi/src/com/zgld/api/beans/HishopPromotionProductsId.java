package com.zgld.api.beans;

/**
 * HishopPromotionProductsId entity. @author MyEclipse Persistence Tools
 */
public class HishopPromotionProductsId extends
		AbstractHishopPromotionProductsId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopPromotionProductsId() {
	}

	/** full constructor */
	public HishopPromotionProductsId(HishopPromotions hishopPromotions,
			HishopProducts hishopProducts) {
		super(hishopPromotions, hishopProducts);
	}

}
