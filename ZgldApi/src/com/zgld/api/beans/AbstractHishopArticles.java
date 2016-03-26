package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopArticles entity provides the base persistence definition of the
 * HishopArticles entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopArticles implements java.io.Serializable {

	// Fields

	private Integer articleId;
	private HishopArticleCategories hishopArticleCategories;
	private String title;
	private String metaDescription;
	private String metaKeywords;
	private String iconUrl;
	private String description;
	private String content;
	private Date addedDate;
	private Boolean isRelease;

	// Constructors

	/** default constructor */
	public AbstractHishopArticles() {
	}

	/** minimal constructor */
	public AbstractHishopArticles(HishopArticleCategories hishopArticleCategories, String title, String content, Date addedDate, Boolean isRelease) {
		this.hishopArticleCategories = hishopArticleCategories;
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
		this.isRelease = isRelease;
	}

	/** full constructor */
	public AbstractHishopArticles(HishopArticleCategories hishopArticleCategories, String title, String metaDescription, String metaKeywords, String iconUrl, String description, String content, Date addedDate, Boolean isRelease) {
		this.hishopArticleCategories = hishopArticleCategories;
		this.title = title;
		this.metaDescription = metaDescription;
		this.metaKeywords = metaKeywords;
		this.iconUrl = iconUrl;
		this.description = description;
		this.content = content;
		this.addedDate = addedDate;
		this.isRelease = isRelease;
	}

	// Property accessors

	public Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public HishopArticleCategories getHishopArticleCategories() {
		return this.hishopArticleCategories;
	}

	public void setHishopArticleCategories(HishopArticleCategories hishopArticleCategories) {
		this.hishopArticleCategories = hishopArticleCategories;
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

	public Boolean getIsRelease() {
		return this.isRelease;
	}

	public void setIsRelease(Boolean isRelease) {
		this.isRelease = isRelease;
	}

}