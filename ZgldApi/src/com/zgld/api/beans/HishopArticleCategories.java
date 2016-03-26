package com.zgld.api.beans;

import java.util.Set;

/**
 * HishopArticleCategories entity. @author MyEclipse Persistence Tools
 */
public class HishopArticleCategories extends AbstractHishopArticleCategories implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopArticleCategories() {
	}

	/** minimal constructor */
	public HishopArticleCategories(String name, Integer displaySequence) {
		super(name, displaySequence);
	}

	/** full constructor */
	public HishopArticleCategories(String name, Integer displaySequence, String iconUrl, String description, Set hishopArticleses) {
		super(name, displaySequence, iconUrl, description, hishopArticleses);
	}

}
