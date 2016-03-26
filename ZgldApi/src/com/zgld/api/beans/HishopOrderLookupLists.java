package com.zgld.api.beans;

import java.util.Set;

/**
 * HishopOrderLookupLists entity. @author MyEclipse Persistence Tools
 */
public class HishopOrderLookupLists extends AbstractHishopOrderLookupLists implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopOrderLookupLists() {
	}

	/** minimal constructor */
	public HishopOrderLookupLists(String name, Integer selectMode) {
		super(name, selectMode);
	}

	/** full constructor */
	public HishopOrderLookupLists(String name, Integer selectMode, String description, Set hishopOrderLookupItemses) {
		super(name, selectMode, description, hishopOrderLookupItemses);
	}

}
