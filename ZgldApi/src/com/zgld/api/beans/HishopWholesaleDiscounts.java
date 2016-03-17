package com.zgld.api.beans;

/**
 * HishopWholesaleDiscounts entity. @author MyEclipse Persistence Tools
 */
public class HishopWholesaleDiscounts extends AbstractHishopWholesaleDiscounts
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopWholesaleDiscounts() {
	}

	/** full constructor */
	public HishopWholesaleDiscounts(HishopPromotions hishopPromotions,
			Integer quantity, Integer discountValue) {
		super(hishopPromotions, quantity, discountValue);
	}

}
