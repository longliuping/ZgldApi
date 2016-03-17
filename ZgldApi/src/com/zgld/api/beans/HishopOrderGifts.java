package com.zgld.api.beans;

/**
 * HishopOrderGifts entity. @author MyEclipse Persistence Tools
 */
public class HishopOrderGifts extends AbstractHishopOrderGifts implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopOrderGifts() {
	}

	/** minimal constructor */
	public HishopOrderGifts(HishopOrderGiftsId id, String giftName) {
		super(id, giftName);
	}

	/** full constructor */
	public HishopOrderGifts(HishopOrderGiftsId id, String giftName,
			Double costPrice, String thumbnailsUrl, Integer quantity) {
		super(id, giftName, costPrice, thumbnailsUrl, quantity);
	}

}
