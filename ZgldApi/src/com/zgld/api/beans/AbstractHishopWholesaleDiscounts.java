package com.zgld.api.beans;

/**
 * AbstractHishopWholesaleDiscounts entity provides the base persistence
 * definition of the HishopWholesaleDiscounts entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopWholesaleDiscounts implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private HishopPromotions hishopPromotions;
	private Integer quantity;
	private Integer discountValue;

	// Constructors

	/** default constructor */
	public AbstractHishopWholesaleDiscounts() {
	}

	/** full constructor */
	public AbstractHishopWholesaleDiscounts(HishopPromotions hishopPromotions, Integer quantity, Integer discountValue) {
		this.hishopPromotions = hishopPromotions;
		this.quantity = quantity;
		this.discountValue = discountValue;
	}

	// Property accessors

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public HishopPromotions getHishopPromotions() {
		return this.hishopPromotions;
	}

	public void setHishopPromotions(HishopPromotions hishopPromotions) {
		this.hishopPromotions = hishopPromotions;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getDiscountValue() {
		return this.discountValue;
	}

	public void setDiscountValue(Integer discountValue) {
		this.discountValue = discountValue;
	}

}