package com.zgld.api.beans;

/**
 * HishopProductAttributesId entity. @author MyEclipse Persistence Tools
 */
public class HishopProductAttributesId extends
		AbstractHishopProductAttributesId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopProductAttributesId() {
	}

	/** full constructor */
	public HishopProductAttributesId(HishopProducts hishopProducts,
			HishopAttributes hishopAttributes, Integer valueId) {
		super(hishopProducts, hishopAttributes, valueId);
	}

}
