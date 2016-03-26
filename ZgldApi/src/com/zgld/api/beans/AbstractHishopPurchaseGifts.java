package com.zgld.api.beans;

/**
 * AbstractHishopPurchaseGifts entity provides the base persistence definition
 * of the HishopPurchaseGifts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopPurchaseGifts implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private HishopPromotions hishopPromotions;
	private Integer buyQuantity;
	private Integer giveQuantity;

	// Constructors

	/** default constructor */
	public AbstractHishopPurchaseGifts() {
	}

	/** full constructor */
	public AbstractHishopPurchaseGifts(HishopPromotions hishopPromotions, Integer buyQuantity, Integer giveQuantity) {
		this.hishopPromotions = hishopPromotions;
		this.buyQuantity = buyQuantity;
		this.giveQuantity = giveQuantity;
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

	public Integer getBuyQuantity() {
		return this.buyQuantity;
	}

	public void setBuyQuantity(Integer buyQuantity) {
		this.buyQuantity = buyQuantity;
	}

	public Integer getGiveQuantity() {
		return this.giveQuantity;
	}

	public void setGiveQuantity(Integer giveQuantity) {
		this.giveQuantity = giveQuantity;
	}

}