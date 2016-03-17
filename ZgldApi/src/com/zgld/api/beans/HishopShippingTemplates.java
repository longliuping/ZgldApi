package com.zgld.api.beans;

import java.util.Set;

/**
 * HishopShippingTemplates entity. @author MyEclipse Persistence Tools
 */
public class HishopShippingTemplates extends AbstractHishopShippingTemplates
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopShippingTemplates() {
	}

	/** minimal constructor */
	public HishopShippingTemplates(String templateName, Integer weight,
			Double price) {
		super(templateName, weight, price);
	}

	/** full constructor */
	public HishopShippingTemplates(String templateName, Integer weight,
			Integer addWeight, Double price, Double addPrice,
			Set hishopShippingTypeses, Set hishopShippingTypeGroupses,
			Set hishopShippingRegionses) {
		super(templateName, weight, addWeight, price, addPrice,
				hishopShippingTypeses, hishopShippingTypeGroupses,
				hishopShippingRegionses);
	}

}
