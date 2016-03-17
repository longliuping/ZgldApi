package com.zgld.api.beans;

import java.util.Set;

/**
 * HishopCategories entity. @author MyEclipse Persistence Tools
 */
public class HishopCategories extends AbstractHishopCategories implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopCategories() {
	}

	/** minimal constructor */
	public HishopCategories(String name, Integer displaySequence,
			Integer depth, String path, Boolean hasChildren) {
		super(name, displaySequence, depth, path, hasChildren);
	}

	/** full constructor */
	public HishopCategories(String name, Integer displaySequence,
			String metaTitle, String metaDescription, String metaKeywords,
			String description, Integer parentCategoryId, Integer depth,
			String path, String rewriteName, String skuprefix,
			Integer associatedProductType, String notes1, String notes2,
			String notes3, String notes4, String notes5, String theme,
			Boolean hasChildren, Set hishopHotkeywordses) {
		super(name, displaySequence, metaTitle, metaDescription, metaKeywords,
				description, parentCategoryId, depth, path, rewriteName,
				skuprefix, associatedProductType, notes1, notes2, notes3,
				notes4, notes5, theme, hasChildren, hishopHotkeywordses);
	}

}
