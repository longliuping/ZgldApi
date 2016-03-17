package com.zgld.api.beans;

/**
 * HishopShippingTypeGroups entity. @author MyEclipse Persistence Tools
 */
public class HishopShippingTypeGroups extends AbstractHishopShippingTypeGroups
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopShippingTypeGroups() {
	}

	/** minimal constructor */
	public HishopShippingTypeGroups(
			HishopShippingTemplates hishopShippingTemplates, Double price) {
		super(hishopShippingTemplates, price);
	}

	/** full constructor */
	public HishopShippingTypeGroups(
			HishopShippingTemplates hishopShippingTemplates, Double price,
			Double addPrice) {
		super(hishopShippingTemplates, price, addPrice);
	}

}
