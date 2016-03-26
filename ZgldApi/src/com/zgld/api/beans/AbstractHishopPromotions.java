package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopPromotions entity provides the base persistence definition of
 * the HishopPromotions entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopPromotions implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private String name;
	private Integer promoteType;
	private String description;
	private Set hishopFullFrees = new HashSet(0);
	private Set hishopWholesaleDiscountses = new HashSet(0);
	private Set hishopPromotionProductses = new HashSet(0);
	private Set hishopPurchaseGiftses = new HashSet(0);
	private Set hishopFullDiscountses = new HashSet(0);
	private Set hishopPromotionMemberGradeses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHishopPromotions() {
	}

	/** minimal constructor */
	public AbstractHishopPromotions(String name, Integer promoteType) {
		this.name = name;
		this.promoteType = promoteType;
	}

	/** full constructor */
	public AbstractHishopPromotions(String name, Integer promoteType, String description, Set hishopFullFrees, Set hishopWholesaleDiscountses, Set hishopPromotionProductses, Set hishopPurchaseGiftses, Set hishopFullDiscountses, Set hishopPromotionMemberGradeses) {
		this.name = name;
		this.promoteType = promoteType;
		this.description = description;
		this.hishopFullFrees = hishopFullFrees;
		this.hishopWholesaleDiscountses = hishopWholesaleDiscountses;
		this.hishopPromotionProductses = hishopPromotionProductses;
		this.hishopPurchaseGiftses = hishopPurchaseGiftses;
		this.hishopFullDiscountses = hishopFullDiscountses;
		this.hishopPromotionMemberGradeses = hishopPromotionMemberGradeses;
	}

	// Property accessors

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPromoteType() {
		return this.promoteType;
	}

	public void setPromoteType(Integer promoteType) {
		this.promoteType = promoteType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getHishopFullFrees() {
		return this.hishopFullFrees;
	}

	public void setHishopFullFrees(Set hishopFullFrees) {
		this.hishopFullFrees = hishopFullFrees;
	}

	public Set getHishopWholesaleDiscountses() {
		return this.hishopWholesaleDiscountses;
	}

	public void setHishopWholesaleDiscountses(Set hishopWholesaleDiscountses) {
		this.hishopWholesaleDiscountses = hishopWholesaleDiscountses;
	}

	public Set getHishopPromotionProductses() {
		return this.hishopPromotionProductses;
	}

	public void setHishopPromotionProductses(Set hishopPromotionProductses) {
		this.hishopPromotionProductses = hishopPromotionProductses;
	}

	public Set getHishopPurchaseGiftses() {
		return this.hishopPurchaseGiftses;
	}

	public void setHishopPurchaseGiftses(Set hishopPurchaseGiftses) {
		this.hishopPurchaseGiftses = hishopPurchaseGiftses;
	}

	public Set getHishopFullDiscountses() {
		return this.hishopFullDiscountses;
	}

	public void setHishopFullDiscountses(Set hishopFullDiscountses) {
		this.hishopFullDiscountses = hishopFullDiscountses;
	}

	public Set getHishopPromotionMemberGradeses() {
		return this.hishopPromotionMemberGradeses;
	}

	public void setHishopPromotionMemberGradeses(Set hishopPromotionMemberGradeses) {
		this.hishopPromotionMemberGradeses = hishopPromotionMemberGradeses;
	}

}