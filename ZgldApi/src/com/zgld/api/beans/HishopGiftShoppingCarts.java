package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopGiftShoppingCarts entity. @author MyEclipse Persistence Tools
 */
public class HishopGiftShoppingCarts extends AbstractHishopGiftShoppingCarts
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopGiftShoppingCarts() {
	}

	/** full constructor */
	public HishopGiftShoppingCarts(HishopGiftShoppingCartsId id,
			Integer quantity, Timestamp addTime) {
		super(id, quantity, addTime);
	}

}
