package com.zgld.api.beans;

/**
 * AbstractHishopPhotoCategories entity provides the base persistence definition
 * of the HishopPhotoCategories entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopPhotoCategories implements
		java.io.Serializable {

	// Fields

	private Integer categoryId;
	private String categoryName;
	private Integer displaySequence;

	// Constructors

	/** default constructor */
	public AbstractHishopPhotoCategories() {
	}

	/** full constructor */
	public AbstractHishopPhotoCategories(String categoryName,
			Integer displaySequence) {
		this.categoryName = categoryName;
		this.displaySequence = displaySequence;
	}

	// Property accessors

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

}