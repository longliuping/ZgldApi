package com.zgld.api.beans;

import java.util.List;
import java.util.Set;

/**
 * HishopCategories entity. @author MyEclipse Persistence Tools
 */
public class HishopCategories extends AbstractHishopCategories implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopCategories() {
	}

	public List<HishopProducts> hishopProducts;

	public List<HishopProducts> getHishopProducts() {
		return hishopProducts;
	}

	public void setHishopProducts(List<HishopProducts> hishopProducts) {
		this.hishopProducts = hishopProducts;
	}

}
