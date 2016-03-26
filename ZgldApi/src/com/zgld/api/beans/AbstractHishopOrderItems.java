package com.zgld.api.beans;

import java.util.Date;

/**
 * AbstractHishopOrderItems entity provides the base persistence definition of
 * the HishopOrderItems entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopOrderItems implements java.io.Serializable {

	// Fields

	private String orderId;
	private String skuId;
	private Integer productId;
	private String sku;
	private Integer quantity;
	private Integer shipmentQuantity;
	private Double costPrice;
	private Double itemListPrice;
	private Double itemAdjustedPrice;
	private String itemDescription;
	private String thumbnailsUrl;
	private Long weight;
	private Integer purchaseGiftId;
	private String purchaseGiftName;
	private Integer wholesaleDiscountId;
	private String wholesaleDiscountName;
	private String skucontent;
	private Date addTime;

	// Constructors

	/** default constructor */
	public AbstractHishopOrderItems() {
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getShipmentQuantity() {
		return shipmentQuantity;
	}

	public void setShipmentQuantity(Integer shipmentQuantity) {
		this.shipmentQuantity = shipmentQuantity;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public Double getItemListPrice() {
		return itemListPrice;
	}

	public void setItemListPrice(Double itemListPrice) {
		this.itemListPrice = itemListPrice;
	}

	public Double getItemAdjustedPrice() {
		return itemAdjustedPrice;
	}

	public void setItemAdjustedPrice(Double itemAdjustedPrice) {
		this.itemAdjustedPrice = itemAdjustedPrice;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getThumbnailsUrl() {
		return thumbnailsUrl;
	}

	public void setThumbnailsUrl(String thumbnailsUrl) {
		this.thumbnailsUrl = thumbnailsUrl;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public Integer getPurchaseGiftId() {
		return purchaseGiftId;
	}

	public void setPurchaseGiftId(Integer purchaseGiftId) {
		this.purchaseGiftId = purchaseGiftId;
	}

	public String getPurchaseGiftName() {
		return purchaseGiftName;
	}

	public void setPurchaseGiftName(String purchaseGiftName) {
		this.purchaseGiftName = purchaseGiftName;
	}

	public Integer getWholesaleDiscountId() {
		return wholesaleDiscountId;
	}

	public void setWholesaleDiscountId(Integer wholesaleDiscountId) {
		this.wholesaleDiscountId = wholesaleDiscountId;
	}

	public String getWholesaleDiscountName() {
		return wholesaleDiscountName;
	}

	public void setWholesaleDiscountName(String wholesaleDiscountName) {
		this.wholesaleDiscountName = wholesaleDiscountName;
	}

	public String getSkucontent() {
		return skucontent;
	}

	public void setSkucontent(String skucontent) {
		this.skucontent = skucontent;
	}

}