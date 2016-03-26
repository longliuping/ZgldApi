package com.zgld.api.beans;

/**
 * HishopRelatedProductsId entity. @author MyEclipse Persistence Tools
 */
public class HishopRelatedProductsId extends AbstractHishopRelatedProductsId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopRelatedProductsId() {
	}

	/** full constructor */
	public HishopRelatedProductsId(Integer productId, Integer relatedProductId) {
		super(productId, relatedProductId);
	}

}
