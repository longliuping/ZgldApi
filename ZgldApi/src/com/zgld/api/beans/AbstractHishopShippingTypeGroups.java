package com.zgld.api.beans;

/**
 * AbstractHishopShippingTypeGroups entity provides the base persistence
 * definition of the HishopShippingTypeGroups entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopShippingTypeGroups implements
		java.io.Serializable {

	// Fields

	private Integer groupId;
	private HishopShippingTemplates hishopShippingTemplates;
	private Double price;
	private Double addPrice;

	// Constructors

	/** default constructor */
	public AbstractHishopShippingTypeGroups() {
	}

	/** minimal constructor */
	public AbstractHishopShippingTypeGroups(
			HishopShippingTemplates hishopShippingTemplates, Double price) {
		this.hishopShippingTemplates = hishopShippingTemplates;
		this.price = price;
	}

	/** full constructor */
	public AbstractHishopShippingTypeGroups(
			HishopShippingTemplates hishopShippingTemplates, Double price,
			Double addPrice) {
		this.hishopShippingTemplates = hishopShippingTemplates;
		this.price = price;
		this.addPrice = addPrice;
	}

	// Property accessors

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public HishopShippingTemplates getHishopShippingTemplates() {
		return this.hishopShippingTemplates;
	}

	public void setHishopShippingTemplates(
			HishopShippingTemplates hishopShippingTemplates) {
		this.hishopShippingTemplates = hishopShippingTemplates;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getAddPrice() {
		return this.addPrice;
	}

	public void setAddPrice(Double addPrice) {
		this.addPrice = addPrice;
	}

}