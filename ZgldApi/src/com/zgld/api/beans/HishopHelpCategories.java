package com.zgld.api.beans;

import java.util.Set;

/**
 * HishopHelpCategories entity. @author MyEclipse Persistence Tools
 */
public class HishopHelpCategories extends AbstractHishopHelpCategories implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopHelpCategories() {
	}

	/** minimal constructor */
	public HishopHelpCategories(String name, Integer displaySequence, Boolean isShowFooter) {
		super(name, displaySequence, isShowFooter);
	}

	/** full constructor */
	public HishopHelpCategories(String name, Integer displaySequence, String iconUrl, String indexChar, String description, Boolean isShowFooter, Set hishopHelpses) {
		super(name, displaySequence, iconUrl, indexChar, description, isShowFooter, hishopHelpses);
	}

}
