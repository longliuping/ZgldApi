package com.zgld.api.beans;

/**
 * AbstractHishopOrderLookupItems entity provides the base persistence
 * definition of the HishopOrderLookupItems entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopOrderLookupItems implements
		java.io.Serializable {

	// Fields

	private Integer lookupItemId;
	private HishopOrderLookupLists hishopOrderLookupLists;
	private String name;
	private Boolean isUserInputRequired;
	private String userInputTitle;
	private Double appendMoney;
	private Integer calculateMode;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractHishopOrderLookupItems() {
	}

	/** minimal constructor */
	public AbstractHishopOrderLookupItems(
			HishopOrderLookupLists hishopOrderLookupLists, String name,
			Boolean isUserInputRequired) {
		this.hishopOrderLookupLists = hishopOrderLookupLists;
		this.name = name;
		this.isUserInputRequired = isUserInputRequired;
	}

	/** full constructor */
	public AbstractHishopOrderLookupItems(
			HishopOrderLookupLists hishopOrderLookupLists, String name,
			Boolean isUserInputRequired, String userInputTitle,
			Double appendMoney, Integer calculateMode, String remark) {
		this.hishopOrderLookupLists = hishopOrderLookupLists;
		this.name = name;
		this.isUserInputRequired = isUserInputRequired;
		this.userInputTitle = userInputTitle;
		this.appendMoney = appendMoney;
		this.calculateMode = calculateMode;
		this.remark = remark;
	}

	// Property accessors

	public Integer getLookupItemId() {
		return this.lookupItemId;
	}

	public void setLookupItemId(Integer lookupItemId) {
		this.lookupItemId = lookupItemId;
	}

	public HishopOrderLookupLists getHishopOrderLookupLists() {
		return this.hishopOrderLookupLists;
	}

	public void setHishopOrderLookupLists(
			HishopOrderLookupLists hishopOrderLookupLists) {
		this.hishopOrderLookupLists = hishopOrderLookupLists;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsUserInputRequired() {
		return this.isUserInputRequired;
	}

	public void setIsUserInputRequired(Boolean isUserInputRequired) {
		this.isUserInputRequired = isUserInputRequired;
	}

	public String getUserInputTitle() {
		return this.userInputTitle;
	}

	public void setUserInputTitle(String userInputTitle) {
		this.userInputTitle = userInputTitle;
	}

	public Double getAppendMoney() {
		return this.appendMoney;
	}

	public void setAppendMoney(Double appendMoney) {
		this.appendMoney = appendMoney;
	}

	public Integer getCalculateMode() {
		return this.calculateMode;
	}

	public void setCalculateMode(Integer calculateMode) {
		this.calculateMode = calculateMode;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}