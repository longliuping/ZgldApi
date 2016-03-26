package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopHelps entity. @author MyEclipse Persistence Tools
 */
public class HishopHelps extends AbstractHishopHelps implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopHelps() {
	}

	/** minimal constructor */
	public HishopHelps(HishopHelpCategories hishopHelpCategories, String title, String content, Timestamp addedDate, Boolean isShowFooter) {
		super(hishopHelpCategories, title, content, addedDate, isShowFooter);
	}

	/** full constructor */
	public HishopHelps(HishopHelpCategories hishopHelpCategories, String title, String metaDescription, String metaKeywords, String description, String content, Timestamp addedDate, Boolean isShowFooter) {
		super(hishopHelpCategories, title, metaDescription, metaKeywords, description, content, addedDate, isShowFooter);
	}

}
