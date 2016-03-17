package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.List;

/**
 * HishopShoppingCarts entity. @author MyEclipse Persistence Tools
 */
public class HishopShoppingCarts extends AbstractHishopShoppingCarts implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopShoppingCarts() {
	}
	//产品信息
	HishopProducts hishopProducts;
	List<HishopProducts> listHishopProducts;
	Supplier supplier;
	
	public List<HishopProducts> getListHishopProducts() {
		return listHishopProducts;
	}
	public void setListHishopProducts(List<HishopProducts> listHishopProducts) {
		this.listHishopProducts = listHishopProducts;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public HishopProducts getHishopProducts() {
		return hishopProducts;
	}
	public void setHishopProducts(HishopProducts hishopProducts) {
		this.hishopProducts = hishopProducts;
	}
	
	
}
