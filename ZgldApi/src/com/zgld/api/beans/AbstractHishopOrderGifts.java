package com.zgld.api.beans;

/**
 * AbstractHishopOrderGifts entity provides the base persistence definition of
 * the HishopOrderGifts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopOrderGifts implements java.io.Serializable {

	// Fields

	private HishopOrderGiftsId id;
	private String giftName;
	private Double costPrice;
	private String thumbnailsUrl;
	private Integer quantity;

	// Constructors

	/** default constructor */
	public AbstractHishopOrderGifts() {
	}

	/** minimal constructor */
	public AbstractHishopOrderGifts(HishopOrderGiftsId id, String giftName) {
		this.id = id;
		this.giftName = giftName;
	}

	/** full constructor */
	public AbstractHishopOrderGifts(HishopOrderGiftsId id, String giftName,
			Double costPrice, String thumbnailsUrl, Integer quantity) {
		this.id = id;
		this.giftName = giftName;
		this.costPrice = costPrice;
		this.thumbnailsUrl = thumbnailsUrl;
		this.quantity = quantity;
	}

	// Property accessors

	public HishopOrderGiftsId getId() {
		return this.id;
	}

	public void setId(HishopOrderGiftsId id) {
		this.id = id;
	}

	public String getGiftName() {
		return this.giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public Double getCostPrice() {
		return this.costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public String getThumbnailsUrl() {
		return this.thumbnailsUrl;
	}

	public void setThumbnailsUrl(String thumbnailsUrl) {
		this.thumbnailsUrl = thumbnailsUrl;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}