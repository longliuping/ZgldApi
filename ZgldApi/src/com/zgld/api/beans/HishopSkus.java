package com.zgld.api.beans;

import java.util.List;
import java.util.Set;

/**
 * HishopSkus entity. @author MyEclipse Persistence Tools
 */
public class HishopSkus extends AbstractHishopSkus implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopSkus() {
	}

	List<HishopSkuitems> hishopSkuitems;

	public List<HishopSkuitems> getHishopSkuitems() {
		return hishopSkuitems;
	}

	public void setHishopSkuitems(List<HishopSkuitems> hishopSkuitems) {
		this.hishopSkuitems = hishopSkuitems;
	}

}
