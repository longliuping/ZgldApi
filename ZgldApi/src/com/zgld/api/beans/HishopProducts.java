package com.zgld.api.beans;

import java.util.List;

/**
 * HishopProducts entity. @author MyEclipse Persistence Tools
 */
public class HishopProducts extends AbstractHishopProducts implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopProducts() {
	}

	List<HishopSkus> listHishopSkus;
	List<HishopAttributes> listHishopAttributes;
	List<HishopAttributeValues> listHishopAttributeValues;
	HishopShoppingCarts hishopShoppingCarts;
	// 产品规格价格
	HishopSkus hishopSkus;
	List<HishopSkuitems> listHishopSkuitems;
	Supplier supplier;

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public HishopShoppingCarts getHishopShoppingCarts() {
		return hishopShoppingCarts;
	}

	public void setHishopShoppingCarts(HishopShoppingCarts hishopShoppingCarts) {
		this.hishopShoppingCarts = hishopShoppingCarts;
	}

	public List<HishopSkus> getListHishopSkus() {
		return listHishopSkus;
	}

	public void setListHishopSkus(List<HishopSkus> listHishopSkus) {
		this.listHishopSkus = listHishopSkus;
	}

	public List<HishopAttributes> getListHishopAttributes() {
		return listHishopAttributes;
	}

	public void setListHishopAttributes(List<HishopAttributes> listHishopAttributes) {
		this.listHishopAttributes = listHishopAttributes;
	}

	public List<HishopAttributeValues> getListHishopAttributeValues() {
		return listHishopAttributeValues;
	}

	public void setListHishopAttributeValues(List<HishopAttributeValues> listHishopAttributeValues) {
		this.listHishopAttributeValues = listHishopAttributeValues;
	}

	public HishopSkus getHishopSkus() {
		return hishopSkus;
	}

	public void setHishopSkus(HishopSkus hishopSkus) {
		this.hishopSkus = hishopSkus;
	}

	public List<HishopSkuitems> getListHishopSkuitems() {
		return listHishopSkuitems;
	}

	public void setListHishopSkuitems(List<HishopSkuitems> listHishopSkuitems) {
		this.listHishopSkuitems = listHishopSkuitems;
	}

}
