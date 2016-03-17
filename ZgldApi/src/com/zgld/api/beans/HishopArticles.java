package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopArticles entity. @author MyEclipse Persistence Tools
 */
public class HishopArticles extends AbstractHishopArticles implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopArticles() {
	}

	/** minimal constructor */
	public HishopArticles(HishopArticleCategories hishopArticleCategories,
			String title, String content, Timestamp addedDate, Boolean isRelease) {
		super(hishopArticleCategories, title, content, addedDate, isRelease);
	}

	/** full constructor */
	public HishopArticles(HishopArticleCategories hishopArticleCategories,
			String title, String metaDescription, String metaKeywords,
			String iconUrl, String description, String content,
			Timestamp addedDate, Boolean isRelease) {
		super(hishopArticleCategories, title, metaDescription, metaKeywords,
				iconUrl, description, content, addedDate, isRelease);
	}

}
