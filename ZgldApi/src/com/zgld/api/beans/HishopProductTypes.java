package com.zgld.api.beans;

import java.util.List;
import java.util.Set;

/**
 * HishopProductTypes entity. @author MyEclipse Persistence Tools
 */
public class HishopProductTypes extends AbstractHishopProductTypes implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopProductTypes() {
	}

	/** minimal constructor */
	public HishopProductTypes(String typeName) {
		super(typeName);
	}
	public List<HishopProducts> hishopProducts;
	public List<HishopProducts> getHishopProducts() {
		return hishopProducts;
	}

	public void setHishopProducts(List<HishopProducts> hishopProducts) {
		this.hishopProducts = hishopProducts;
	}
	
}
