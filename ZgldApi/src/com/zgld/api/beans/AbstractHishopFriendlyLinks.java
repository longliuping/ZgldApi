package com.zgld.api.beans;

/**
 * AbstractHishopFriendlyLinks entity provides the base persistence definition
 * of the HishopFriendlyLinks entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopFriendlyLinks implements java.io.Serializable {

	// Fields

	private Integer linkId;
	private String imageUrl;
	private String linkUrl;
	private String title;
	private Boolean visible;
	private Integer displaySequence;

	// Constructors

	/** default constructor */
	public AbstractHishopFriendlyLinks() {
	}

	/** minimal constructor */
	public AbstractHishopFriendlyLinks(Boolean visible, Integer displaySequence) {
		this.visible = visible;
		this.displaySequence = displaySequence;
	}

	/** full constructor */
	public AbstractHishopFriendlyLinks(String imageUrl, String linkUrl, String title, Boolean visible, Integer displaySequence) {
		this.imageUrl = imageUrl;
		this.linkUrl = linkUrl;
		this.title = title;
		this.visible = visible;
		this.displaySequence = displaySequence;
	}

	// Property accessors

	public Integer getLinkId() {
		return this.linkId;
	}

	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getVisible() {
		return this.visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

}