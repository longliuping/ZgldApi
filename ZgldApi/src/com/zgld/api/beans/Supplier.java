package com.zgld.api.beans;

import java.util.List;

/**
 * Supplier entity. @author MyEclipse Persistence Tools
 */
public class Supplier extends AbstractSupplier implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Supplier() {
	}

	/** minimal constructor */
	public Supplier(String supplierName) {
		super(supplierName);
	}

	List<HishopProducts> listHishopProducts;
	HishopProducts hishopProducts;

	public HishopProducts getHishopProducts() {
		return hishopProducts;
	}

	public void setHishopProducts(HishopProducts hishopProducts) {
		this.hishopProducts = hishopProducts;
	}

	public List<HishopProducts> getListHishopProducts() {
		return listHishopProducts;
	}

	public void setListHishopProducts(List<HishopProducts> listHishopProducts) {
		this.listHishopProducts = listHishopProducts;
	}

}
