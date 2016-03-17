package com.zgld.api.beans;

/**
 * AbstractHishopFullDiscounts entity provides the base persistence definition
 * of the HishopFullDiscounts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopFullDiscounts implements
		java.io.Serializable {

	// Fields

	private Integer activityId;
	private HishopPromotions hishopPromotions;
	private Double amount;
	private Double discountValue;
	private Integer valueType;

	// Constructors

	/** default constructor */
	public AbstractHishopFullDiscounts() {
	}

	/** full constructor */
	public AbstractHishopFullDiscounts(HishopPromotions hishopPromotions,
			Double amount, Double discountValue, Integer valueType) {
		this.hishopPromotions = hishopPromotions;
		this.amount = amount;
		this.discountValue = discountValue;
		this.valueType = valueType;
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

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getDiscountValue() {
		return this.discountValue;
	}

	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}

	public Integer getValueType() {
		return this.valueType;
	}

	public void setValueType(Integer valueType) {
		this.valueType = valueType;
	}

}