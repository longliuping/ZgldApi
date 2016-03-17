package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopSkus entity provides the base persistence definition of the
 * HishopSkus entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopSkus implements java.io.Serializable {

	// Fields

	private String skuId;
	private Integer productId;
	private String sku;
	private Integer weight;
	private Integer stock;
	private Double costPrice;
	private Double salePrice;
	

	// Constructors

	/** default constructor */
	public AbstractHishopSkus() {
	}


	public String getSkuId() {
		return skuId;
	}


	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}


	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}


	public Integer getWeight() {
		return weight;
	}


	public void setWeight(Integer weight) {
		this.weight = weight;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public Double getCostPrice() {
		return costPrice;
	}


	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}


	public Double getSalePrice() {
		return salePrice;
	}


	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

}