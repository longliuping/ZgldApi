package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractVwHishopBrowseProductList entity provides the base persistence
 * definition of the VwHishopBrowseProductList entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractVwHishopBrowseProductList implements java.io.Serializable {

	private Integer categoryId;
	private Integer typeId;
	private Integer brandId;
	private Integer productId;
	private String productName;
	private String productCode;
	private String shortDescription;
	private Double marketPrice;
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
	private Integer saleStatus;
	private Integer displaySequence;
	private String mainCategoryPath;
	private String extendCategoryPath;
	private Integer saleCounts;
	private Date addedDate;
	private String description;
	private Integer vistiCounts;
	private Long taobaoProductId;
	private Double salePrice;
	private String skuId;
	private Integer stock;
	private Integer weight;
	private Integer isMakeTaobao;

	// Constructors

	/** default constructor */
	public AbstractVwHishopBrowseProductList() {
	}

	// Property accessors

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

	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
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

	public Double getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
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

	public Integer getSaleStatus() {
		return this.saleStatus;
	}

	public void setSaleStatus(Integer saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
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

	public Integer getSaleCounts() {
		return this.saleCounts;
	}

	public void setSaleCounts(Integer saleCounts) {
		this.saleCounts = saleCounts;
	}

	public Date getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getVistiCounts() {
		return this.vistiCounts;
	}

	public void setVistiCounts(Integer vistiCounts) {
		this.vistiCounts = vistiCounts;
	}

	public Long getTaobaoProductId() {
		return this.taobaoProductId;
	}

	public void setTaobaoProductId(Long taobaoProductId) {
		this.taobaoProductId = taobaoProductId;
	}

	public Double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public String getSkuId() {
		return this.skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getIsMakeTaobao() {
		return this.isMakeTaobao;
	}

	public void setIsMakeTaobao(Integer isMakeTaobao) {
		this.isMakeTaobao = isMakeTaobao;
	}

}