package com.zgld.api.beans;

/**
 * HishopOrderGiftsId entity. @author MyEclipse Persistence Tools
 */
public class HishopOrderGiftsId extends AbstractHishopOrderGiftsId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopOrderGiftsId() {
	}

	/** full constructor */
	public HishopOrderGiftsId(HishopOrders hishopOrders, Integer giftId) {
		super(hishopOrders, giftId);
	}

}
