package com.zgld.api.beans;

/**
 * HishopFullDiscounts entity. @author MyEclipse Persistence Tools
 */
public class HishopFullDiscounts extends AbstractHishopFullDiscounts implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopFullDiscounts() {
	}

	/** full constructor */
	public HishopFullDiscounts(HishopPromotions hishopPromotions, Double amount, Double discountValue, Integer valueType) {
		super(hishopPromotions, amount, discountValue, valueType);
	}

}
