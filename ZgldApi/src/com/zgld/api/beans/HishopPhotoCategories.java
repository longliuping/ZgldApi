package com.zgld.api.beans;

/**
 * HishopPhotoCategories entity. @author MyEclipse Persistence Tools
 */
public class HishopPhotoCategories extends AbstractHishopPhotoCategories
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopPhotoCategories() {
	}

	/** full constructor */
	public HishopPhotoCategories(String categoryName, Integer displaySequence) {
		super(categoryName, displaySequence);
	}

}
