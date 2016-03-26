package com.zgld.api.beans;

import java.util.Set;

/**
 * HishopPromotions entity. @author MyEclipse Persistence Tools
 */
public class HishopPromotions extends AbstractHishopPromotions implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopPromotions() {
	}

	/** minimal constructor */
	public HishopPromotions(String name, Integer promoteType) {
		super(name, promoteType);
	}

	/** full constructor */
	public HishopPromotions(String name, Integer promoteType, String description, Set hishopFullFrees, Set hishopWholesaleDiscountses, Set hishopPromotionProductses, Set hishopPurchaseGiftses, Set hishopFullDiscountses, Set hishopPromotionMemberGradeses) {
		super(name, promoteType, description, hishopFullFrees, hishopWholesaleDiscountses, hishopPromotionProductses, hishopPurchaseGiftses, hishopFullDiscountses, hishopPromotionMemberGradeses);
	}

}
