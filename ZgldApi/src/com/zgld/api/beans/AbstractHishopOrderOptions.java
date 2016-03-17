package com.zgld.api.beans;

/**
 * AbstractHishopOrderOptions entity provides the base persistence definition of
 * the HishopOrderOptions entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopOrderOptions implements
		java.io.Serializable {

	// Fields

	private HishopOrderOptionsId id;
	private String listDescription;
	private String itemDescription;
	private Double adjustedPrice;
	private String customerTitle;
	private String customerDescription;

	// Constructors

	/** default constructor */
	public AbstractHishopOrderOptions() {
	}

	/** minimal constructor */
	public AbstractHishopOrderOptions(HishopOrderOptionsId id,
			String listDescription, String itemDescription, Double adjustedPrice) {
		this.id = id;
		this.listDescription = listDescription;
		this.itemDescription = itemDescription;
		this.adjustedPrice = adjustedPrice;
	}

	/** full constructor */
	public AbstractHishopOrderOptions(HishopOrderOptionsId id,
			String listDescription, String itemDescription,
			Double adjustedPrice, String customerTitle,
			String customerDescription) {
		this.id = id;
		this.listDescription = listDescription;
		this.itemDescription = itemDescription;
		this.adjustedPrice = adjustedPrice;
		this.customerTitle = customerTitle;
		this.customerDescription = customerDescription;
	}

	// Property accessors

	public HishopOrderOptionsId getId() {
		return this.id;
	}

	public void setId(HishopOrderOptionsId id) {
		this.id = id;
	}

	public String getListDescription() {
		return this.listDescription;
	}

	public void setListDescription(String listDescription) {
		this.listDescription = listDescription;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Double getAdjustedPrice() {
		return this.adjustedPrice;
	}

	public void setAdjustedPrice(Double adjustedPrice) {
		this.adjustedPrice = adjustedPrice;
	}

	public String getCustomerTitle() {
		return this.customerTitle;
	}

	public void setCustomerTitle(String customerTitle) {
		this.customerTitle = customerTitle;
	}

	public String getCustomerDescription() {
		return this.customerDescription;
	}

	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}

}