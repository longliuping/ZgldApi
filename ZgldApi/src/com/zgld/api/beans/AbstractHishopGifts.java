package com.zgld.api.beans;

/**
 * AbstractHishopGifts entity provides the base persistence definition of the
 * HishopGifts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopGifts implements java.io.Serializable {

	// Fields

	private Integer giftId;
	private String name;
	private String shortDescription;
	private String unit;
	private String longDescription;
	private String title;
	private String metaDescription;
	private String metaKeywords;
	private Double costPrice;
	private String imageUrl;
	private String thumbnailUrl40;
	private String thumbnailUrl60;
	private String thumbnailUrl100;
	private String thumbnailUrl160;
	private String thumbnailUrl180;
	private String thumbnailUrl220;
	private String thumbnailUrl310;
	private String thumbnailUrl410;
	private Double marketPrice;
	private Integer needPoint;

	// Constructors

	/** default constructor */
	public AbstractHishopGifts() {
	}

	/** minimal constructor */
	public AbstractHishopGifts(String name, Integer needPoint) {
		this.name = name;
		this.needPoint = needPoint;
	}

	/** full constructor */
	public AbstractHishopGifts(String name, String shortDescription, String unit, String longDescription, String title, String metaDescription, String metaKeywords, Double costPrice, String imageUrl, String thumbnailUrl40, String thumbnailUrl60, String thumbnailUrl100, String thumbnailUrl160, String thumbnailUrl180, String thumbnailUrl220, String thumbnailUrl310, String thumbnailUrl410, Double marketPrice, Integer needPoint) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.unit = unit;
		this.longDescription = longDescription;
		this.title = title;
		this.metaDescription = metaDescription;
		this.metaKeywords = metaKeywords;
		this.costPrice = costPrice;
		this.imageUrl = imageUrl;
		this.thumbnailUrl40 = thumbnailUrl40;
		this.thumbnailUrl60 = thumbnailUrl60;
		this.thumbnailUrl100 = thumbnailUrl100;
		this.thumbnailUrl160 = thumbnailUrl160;
		this.thumbnailUrl180 = thumbnailUrl180;
		this.thumbnailUrl220 = thumbnailUrl220;
		this.thumbnailUrl310 = thumbnailUrl310;
		this.thumbnailUrl410 = thumbnailUrl410;
		this.marketPrice = marketPrice;
		this.needPoint = needPoint;
	}

	// Property accessors

	public Integer getGiftId() {
		return this.giftId;
	}

	public void setGiftId(Integer giftId) {
		this.giftId = giftId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public Double getCostPrice() {
		return this.costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getThumbnailUrl40() {
		return this.thumbnailUrl40;
	}

	public void setThumbnailUrl40(String thumbnailUrl40) {
		this.thumbnailUrl40 = thumbnailUrl40;
	}

	public String getThumbnailUrl60() {
		return this.thumbnailUrl60;
	}

	public void setThumbnailUrl60(String thumbnailUrl60) {
		this.thumbnailUrl60 = thumbnailUrl60;
	}

	public String getThumbnailUrl100() {
		return this.thumbnailUrl100;
	}

	public void setThumbnailUrl100(String thumbnailUrl100) {
		this.thumbnailUrl100 = thumbnailUrl100;
	}

	public String getThumbnailUrl160() {
		return this.thumbnailUrl160;
	}

	public void setThumbnailUrl160(String thumbnailUrl160) {
		this.thumbnailUrl160 = thumbnailUrl160;
	}

	public String getThumbnailUrl180() {
		return this.thumbnailUrl180;
	}

	public void setThumbnailUrl180(String thumbnailUrl180) {
		this.thumbnailUrl180 = thumbnailUrl180;
	}

	public String getThumbnailUrl220() {
		return this.thumbnailUrl220;
	}

	public void setThumbnailUrl220(String thumbnailUrl220) {
		this.thumbnailUrl220 = thumbnailUrl220;
	}

	public String getThumbnailUrl310() {
		return this.thumbnailUrl310;
	}

	public void setThumbnailUrl310(String thumbnailUrl310) {
		this.thumbnailUrl310 = thumbnailUrl310;
	}

	public String getThumbnailUrl410() {
		return this.thumbnailUrl410;
	}

	public void setThumbnailUrl410(String thumbnailUrl410) {
		this.thumbnailUrl410 = thumbnailUrl410;
	}

	public Double getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Integer getNeedPoint() {
		return this.needPoint;
	}

	public void setNeedPoint(Integer needPoint) {
		this.needPoint = needPoint;
	}

}