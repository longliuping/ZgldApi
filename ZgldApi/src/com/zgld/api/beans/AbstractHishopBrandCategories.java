package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopBrandCategories entity provides the base persistence definition
 * of the HishopBrandCategories entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopBrandCategories implements
		java.io.Serializable {

	// Fields

	private Integer brandId;
	private String brandName;
	private String logo;
	private String companyUrl;
	private String rewriteName;
	private String metaKeywords;
	private String metaDescription;
	private String description;
	private Integer displaySequence;
	private String theme;
	private Set hishopProductTypeBrandses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHishopBrandCategories() {
	}

	/** minimal constructor */
	public AbstractHishopBrandCategories(String brandName,
			Integer displaySequence) {
		this.brandName = brandName;
		this.displaySequence = displaySequence;
	}

	/** full constructor */
	public AbstractHishopBrandCategories(String brandName, String logo,
			String companyUrl, String rewriteName, String metaKeywords,
			String metaDescription, String description,
			Integer displaySequence, String theme, Set hishopProductTypeBrandses) {
		this.brandName = brandName;
		this.logo = logo;
		this.companyUrl = companyUrl;
		this.rewriteName = rewriteName;
		this.metaKeywords = metaKeywords;
		this.metaDescription = metaDescription;
		this.description = description;
		this.displaySequence = displaySequence;
		this.theme = theme;
		this.hishopProductTypeBrandses = hishopProductTypeBrandses;
	}

	// Property accessors

	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getCompanyUrl() {
		return this.companyUrl;
	}

	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	public String getRewriteName() {
		return this.rewriteName;
	}

	public void setRewriteName(String rewriteName) {
		this.rewriteName = rewriteName;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Set getHishopProductTypeBrandses() {
		return this.hishopProductTypeBrandses;
	}

	public void setHishopProductTypeBrandses(Set hishopProductTypeBrandses) {
		this.hishopProductTypeBrandses = hishopProductTypeBrandses;
	}

}