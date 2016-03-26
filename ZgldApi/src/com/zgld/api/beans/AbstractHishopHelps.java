package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopHelps entity provides the base persistence definition of the
 * HishopHelps entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopHelps implements java.io.Serializable {

	// Fields

	private Integer helpId;
	private HishopHelpCategories hishopHelpCategories;
	private String title;
	private String metaDescription;
	private String metaKeywords;
	private String description;
	private String content;
	private Date addedDate;
	private Boolean isShowFooter;

	// Constructors

	/** default constructor */
	public AbstractHishopHelps() {
	}

	/** minimal constructor */
	public AbstractHishopHelps(HishopHelpCategories hishopHelpCategories, String title, String content, Date addedDate, Boolean isShowFooter) {
		this.hishopHelpCategories = hishopHelpCategories;
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
		this.isShowFooter = isShowFooter;
	}

	/** full constructor */
	public AbstractHishopHelps(HishopHelpCategories hishopHelpCategories, String title, String metaDescription, String metaKeywords, String description, String content, Date addedDate, Boolean isShowFooter) {
		this.hishopHelpCategories = hishopHelpCategories;
		this.title = title;
		this.metaDescription = metaDescription;
		this.metaKeywords = metaKeywords;
		this.description = description;
		this.content = content;
		this.addedDate = addedDate;
		this.isShowFooter = isShowFooter;
	}

	// Property accessors

	public Integer getHelpId() {
		return this.helpId;
	}

	public void setHelpId(Integer helpId) {
		this.helpId = helpId;
	}

	public HishopHelpCategories getHishopHelpCategories() {
		return this.hishopHelpCategories;
	}

	public void setHishopHelpCategories(HishopHelpCategories hishopHelpCategories) {
		this.hishopHelpCategories = hishopHelpCategories;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Boolean getIsShowFooter() {
		return this.isShowFooter;
	}

	public void setIsShowFooter(Boolean isShowFooter) {
		this.isShowFooter = isShowFooter;
	}

}