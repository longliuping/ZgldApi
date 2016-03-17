package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopProducts entity provides the base persistence definition of the
 * HishopProducts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopProducts implements java.io.Serializable {

	// Fields

	private Integer productId;
	private Integer categoryId;
	private Integer typeId;
	private String productName;
	private String productCode;
	private String shortDescription;
	private String unit;
	private String description;
	private String title;
	private String metaDescription;
	private String metaKeywords;
	private Integer saleStatus;
	private Date addedDate;
	private Integer vistiCounts;
	private Integer saleCounts;
	private Integer displaySequence;
	private String imageUrl1;
	private String imageUrl2;
	private String imageUrl3;
	private String imageUrl4;
	private String imageUrl5;
	private String thumbnailUrl40;
	private String thumbnailUrl60;
	private String thumbnailUrl100;
	private String thumbnailUrl160;
	private String thumbnailUrl180;
	private String thumbnailUrl220;
	private String thumbnailUrl310;
	private String thumbnailUrl410;
	private Double marketPrice;
	private Integer brandId;
	private String mainCategoryPath;
	private String extendCategoryPath;
	private Boolean hasSku;
	private Long taobaoProductId;
	private Integer userid;

	// Constructors

	/** default constructor */
	public AbstractHishopProducts() {
	}

	// Property accessors

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Integer getSaleStatus() {
		return this.saleStatus;
	}

	public void setSaleStatus(Integer saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Date getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Integer getVistiCounts() {
		return this.vistiCounts;
	}

	public void setVistiCounts(Integer vistiCounts) {
		this.vistiCounts = vistiCounts;
	}

	public Integer getSaleCounts() {
		return this.saleCounts;
	}

	public void setSaleCounts(Integer saleCounts) {
		this.saleCounts = saleCounts;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public String getImageUrl1() {
		return this.imageUrl1;
	}

	public void setImageUrl1(String imageUrl1) {
		this.imageUrl1 = imageUrl1;
	}

	public String getImageUrl2() {
		return this.imageUrl2;
	}

	public void setImageUrl2(String imageUrl2) {
		this.imageUrl2 = imageUrl2;
	}

	public String getImageUrl3() {
		return this.imageUrl3;
	}

	public void setImageUrl3(String imageUrl3) {
		this.imageUrl3 = imageUrl3;
	}

	public String getImageUrl4() {
		return this.imageUrl4;
	}

	public void setImageUrl4(String imageUrl4) {
		this.imageUrl4 = imageUrl4;
	}

	public String getImageUrl5() {
		return this.imageUrl5;
	}

	public void setImageUrl5(String imageUrl5) {
		this.imageUrl5 = imageUrl5;
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

	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getMainCategoryPath() {
		return this.mainCategoryPath;
	}

	public void setMainCategoryPath(String mainCategoryPath) {
		this.mainCategoryPath = mainCategoryPath;
	}

	public String getExtendCategoryPath() {
		return this.extendCategoryPath;
	}

	public void setExtendCategoryPath(String extendCategoryPath) {
		this.extendCategoryPath = extendCategoryPath;
	}

	public Boolean getHasSku() {
		return this.hasSku;
	}

	public void setHasSku(Boolean hasSku) {
		this.hasSku = hasSku;
	}

	public Long getTaobaoProductId() {
		return this.taobaoProductId;
	}

	public void setTaobaoProductId(Long taobaoProductId) {
		this.taobaoProductId = taobaoProductId;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}
}