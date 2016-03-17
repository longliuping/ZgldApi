package com.zgld.api.beans;

/**
 * AbstractHishopTags entity provides the base persistence definition of the
 * HishopTags entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopTags implements java.io.Serializable {

	// Fields

	private Integer tagId;
	private String tagName;

	// Constructors

	/** default constructor */
	public AbstractHishopTags() {
	}

	/** full constructor */
	public AbstractHishopTags(String tagName) {
		this.tagName = tagName;
	}

	// Property accessors

	public Integer getTagId() {
		return this.tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}