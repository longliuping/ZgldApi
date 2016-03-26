package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopOrderLookupLists entity provides the base persistence
 * definition of the HishopOrderLookupLists entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopOrderLookupLists implements java.io.Serializable {

	// Fields

	private Integer lookupListId;
	private String name;
	private Integer selectMode;
	private String description;
	private Set hishopOrderLookupItemses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHishopOrderLookupLists() {
	}

	/** minimal constructor */
	public AbstractHishopOrderLookupLists(String name, Integer selectMode) {
		this.name = name;
		this.selectMode = selectMode;
	}

	/** full constructor */
	public AbstractHishopOrderLookupLists(String name, Integer selectMode, String description, Set hishopOrderLookupItemses) {
		this.name = name;
		this.selectMode = selectMode;
		this.description = description;
		this.hishopOrderLookupItemses = hishopOrderLookupItemses;
	}

	// Property accessors

	public Integer getLookupListId() {
		return this.lookupListId;
	}

	public void setLookupListId(Integer lookupListId) {
		this.lookupListId = lookupListId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSelectMode() {
		return this.selectMode;
	}

	public void setSelectMode(Integer selectMode) {
		this.selectMode = selectMode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getHishopOrderLookupItemses() {
		return this.hishopOrderLookupItemses;
	}

	public void setHishopOrderLookupItemses(Set hishopOrderLookupItemses) {
		this.hishopOrderLookupItemses = hishopOrderLookupItemses;
	}

}