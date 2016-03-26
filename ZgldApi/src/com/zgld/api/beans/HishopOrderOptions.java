package com.zgld.api.beans;

/**
 * HishopOrderOptions entity. @author MyEclipse Persistence Tools
 */
public class HishopOrderOptions extends AbstractHishopOrderOptions implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopOrderOptions() {
	}

	/** minimal constructor */
	public HishopOrderOptions(HishopOrderOptionsId id, String listDescription, String itemDescription, Double adjustedPrice) {
		super(id, listDescription, itemDescription, adjustedPrice);
	}

	/** full constructor */
	public HishopOrderOptions(HishopOrderOptionsId id, String listDescription, String itemDescription, Double adjustedPrice, String customerTitle, String customerDescription) {
		super(id, listDescription, itemDescription, adjustedPrice, customerTitle, customerDescription);
	}

}
