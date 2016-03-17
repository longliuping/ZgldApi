package com.zgld.api.beans;

/**
 * AbstractHishopFullFree entity provides the base persistence definition of the
 * HishopFullFree entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopFullFree implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private HishopPromotions hishopPromotions;
	private Double amount;
	private Boolean shipChargeFree;
	private Boolean serviceChargeFree;
	private Boolean optionFeeFree;

	// Constructors

	/** default constructor */
	public AbstractHishopFullFree() {
	}

	/** full constructor */
	public AbstractHishopFullFree(HishopPromotions hishopPromotions,
			Double amount, Boolean shipChargeFree, Boolean serviceChargeFree,
			Boolean optionFeeFree) {
		this.hishopPromotions = hishopPromotions;
		this.amount = amount;
		this.shipChargeFree = shipChargeFree;
		this.serviceChargeFree = serviceChargeFree;
		this.optionFeeFree = optionFeeFree;
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

	public Boolean getShipChargeFree() {
		return this.shipChargeFree;
	}

	public void setShipChargeFree(Boolean shipChargeFree) {
		this.shipChargeFree = shipChargeFree;
	}

	public Boolean getServiceChargeFree() {
		return this.serviceChargeFree;
	}

	public void setServiceChargeFree(Boolean serviceChargeFree) {
		this.serviceChargeFree = serviceChargeFree;
	}

	public Boolean getOptionFeeFree() {
		return this.optionFeeFree;
	}

	public void setOptionFeeFree(Boolean optionFeeFree) {
		this.optionFeeFree = optionFeeFree;
	}

}