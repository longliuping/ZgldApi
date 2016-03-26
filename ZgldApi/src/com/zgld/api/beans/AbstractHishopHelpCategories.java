package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopHelpCategories entity provides the base persistence definition
 * of the HishopHelpCategories entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopHelpCategories implements java.io.Serializable {

	// Fields

	private Integer categoryId;
	private String name;
	private Integer displaySequence;
	private String iconUrl;
	private String indexChar;
	private String description;
	private Boolean isShowFooter;
	private Set hishopHelpses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHishopHelpCategories() {
	}

	/** minimal constructor */
	public AbstractHishopHelpCategories(String name, Integer displaySequence, Boolean isShowFooter) {
		this.name = name;
		this.displaySequence = displaySequence;
		this.isShowFooter = isShowFooter;
	}

	/** full constructor */
	public AbstractHishopHelpCategories(String name, Integer displaySequence, String iconUrl, String indexChar, String description, Boolean isShowFooter, Set hishopHelpses) {
		this.name = name;
		this.displaySequence = displaySequence;
		this.iconUrl = iconUrl;
		this.indexChar = indexChar;
		this.description = description;
		this.isShowFooter = isShowFooter;
		this.hishopHelpses = hishopHelpses;
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

	public String getIndexChar() {
		return this.indexChar;
	}

	public void setIndexChar(String indexChar) {
		this.indexChar = indexChar;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsShowFooter() {
		return this.isShowFooter;
	}

	public void setIsShowFooter(Boolean isShowFooter) {
		this.isShowFooter = isShowFooter;
	}

	public Set getHishopHelpses() {
		return this.hishopHelpses;
	}

	public void setHishopHelpses(Set hishopHelpses) {
		this.hishopHelpses = hishopHelpses;
	}

}