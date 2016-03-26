package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopGiftShoppingCarts entity provides the base persistence
 * definition of the HishopGiftShoppingCarts entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopGiftShoppingCarts implements java.io.Serializable {

	// Fields

	private HishopGiftShoppingCartsId id;
	private Integer quantity;
	private Date addTime;

	// Constructors

	/** default constructor */
	public AbstractHishopGiftShoppingCarts() {
	}

	/** full constructor */
	public AbstractHishopGiftShoppingCarts(HishopGiftShoppingCartsId id, Integer quantity, Date addTime) {
		this.id = id;
		this.quantity = quantity;
		this.addTime = addTime;
	}

	// Property accessors

	public HishopGiftShoppingCartsId getId() {
		return this.id;
	}

	public void setId(HishopGiftShoppingCartsId id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

}