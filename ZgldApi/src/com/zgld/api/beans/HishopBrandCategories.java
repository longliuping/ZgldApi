package com.zgld.api.beans;

import java.util.Set;

/**
 * HishopBrandCategories entity. @author MyEclipse Persistence Tools
 */
public class HishopBrandCategories extends AbstractHishopBrandCategories implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopBrandCategories() {
	}

	/** minimal constructor */
	public HishopBrandCategories(String brandName, Integer displaySequence) {
		super(brandName, displaySequence);
	}

	/** full constructor */
	public HishopBrandCategories(String brandName, String logo, String companyUrl, String rewriteName, String metaKeywords, String metaDescription, String description, Integer displaySequence, String theme, Set hishopProductTypeBrandses) {
		super(brandName, logo, companyUrl, rewriteName, metaKeywords, metaDescription, description, displaySequence, theme, hishopProductTypeBrandses);
	}

}
