package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopArticleCategories entity provides the base persistence
 * definition of the HishopArticleCategories entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopArticleCategories implements
		java.io.Serializable {

	// Fields

	private Integer categoryId;
	private String name;
	private Integer displaySequence;
	private String iconUrl;
	private String description;
	private Set hishopArticleses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHishopArticleCategories() {
	}

	/** minimal constructor */
	public AbstractHishopArticleCategories(String name, Integer displaySequence) {
		this.name = name;
		this.displaySequence = displaySequence;
	}

	/** full constructor */
	public AbstractHishopArticleCategories(String name,
			Integer displaySequence, String iconUrl, String description,
			Set hishopArticleses) {
		this.name = name;
		this.displaySequence = displaySequence;
		this.iconUrl = iconUrl;
		this.description = description;
		this.hishopArticleses = hishopArticleses;
	}

	// Property accessors

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getHishopArticleses() {
		return this.hishopArticleses;
	}

	public void setHishopArticleses(Set hishopArticleses) {
		this.hishopArticleses = hishopArticleses;
	}

}