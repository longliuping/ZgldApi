package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopShoppingCarts entity provides the base persistence definition
 * of the HishopShoppingCarts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopShoppingCarts implements
		java.io.Serializable {

	// Fields

	private Integer userId;
	private String skuId;
	private Integer productId;
	private Integer quantity;
	private Date addTime;

	// Constructors

	/** default constructor */
	public AbstractHishopShoppingCarts() {
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

}