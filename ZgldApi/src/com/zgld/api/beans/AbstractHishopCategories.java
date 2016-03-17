package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopCategories entity provides the base persistence definition of
 * the HishopCategories entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopCategories implements java.io.Serializable {

	// Fields

	private Integer categoryId;
	private String name;
	private Integer displaySequence;
	private String metaTitle;
	private String metaDescription;
	private String metaKeywords;
	private String description;
	private Integer parentCategoryId;
	private Integer depth;
	private String path;
	private String rewriteName;
	private String skuprefix;
	private Integer associatedProductType;
	private String notes1;
	private String notes2;
	private String notes3;
	private String notes4;
	private String notes5;
	private String theme;
	private Boolean hasChildren;
	private Set hishopHotkeywordses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHishopCategories() {
	}

	/** minimal constructor */
	public AbstractHishopCategories(String name, Integer displaySequence,
			Integer depth, String path, Boolean hasChildren) {
		this.name = name;
		this.displaySequence = displaySequence;
		this.depth = depth;
		this.path = path;
		this.hasChildren = hasChildren;
	}

	/** full constructor */
	public AbstractHishopCategories(String name, Integer displaySequence,
			String metaTitle, String metaDescription, String metaKeywords,
			String description, Integer parentCategoryId, Integer depth,
			String path, String rewriteName, String skuprefix,
			Integer associatedProductType, String notes1, String notes2,
			String notes3, String notes4, String notes5, String theme,
			Boolean hasChildren, Set hishopHotkeywordses) {
		this.name = name;
		this.displaySequence = displaySequence;
		this.metaTitle = metaTitle;
		this.metaDescription = metaDescription;
		this.metaKeywords = metaKeywords;
		this.description = description;
		this.parentCategoryId = parentCategoryId;
		this.depth = depth;
		this.path = path;
		this.rewriteName = rewriteName;
		this.skuprefix = skuprefix;
		this.associatedProductType = associatedProductType;
		this.notes1 = notes1;
		this.notes2 = notes2;
		this.notes3 = notes3;
		this.notes4 = notes4;
		this.notes5 = notes5;
		this.theme = theme;
		this.hasChildren = hasChildren;
		this.hishopHotkeywordses = hishopHotkeywordses;
	}

	// Property accessors

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public String getMetaTitle() {
		return this.metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getParentCategoryId() {
		return this.parentCategoryId;
	}

	public void setParentCategoryId(Integer parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	public Integer getDepth() {
		return this.depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getRewriteName() {
		return this.rewriteName;
	}

	public void setRewriteName(String rewriteName) {
		this.rewriteName = rewriteName;
	}

	public String getSkuprefix() {
		return this.skuprefix;
	}

	public void setSkuprefix(String skuprefix) {
		this.skuprefix = skuprefix;
	}

	public Integer getAssociatedProductType() {
		return this.associatedProductType;
	}

	public void setAssociatedProductType(Integer associatedProductType) {
		this.associatedProductType = associatedProductType;
	}

	public String getNotes1() {
		return this.notes1;
	}

	public void setNotes1(String notes1) {
		this.notes1 = notes1;
	}

	public String getNotes2() {
		return this.notes2;
	}

	public void setNotes2(String notes2) {
		this.notes2 = notes2;
	}

	public String getNotes3() {
		return this.notes3;
	}

	public void setNotes3(String notes3) {
		this.notes3 = notes3;
	}

	public String getNotes4() {
		return this.notes4;
	}

	public void setNotes4(String notes4) {
		this.notes4 = notes4;
	}

	public String getNotes5() {
		return this.notes5;
	}

	public void setNotes5(String notes5) {
		this.notes5 = notes5;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Boolean getHasChildren() {
		return this.hasChildren;
	}

	public void setHasChildren(Boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public Set getHishopHotkeywordses() {
		return this.hishopHotkeywordses;
	}

	public void setHishopHotkeywordses(Set hishopHotkeywordses) {
		this.hishopHotkeywordses = hishopHotkeywordses;
	}

}