package com.zgld.api.beans;

/**
 * HishopSkuitems entity. @author MyEclipse Persistence Tools
 */
public class HishopSkuitems extends AbstractHishopSkuitems implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopSkuitems() {
	}

	HishopAttributes hishopAttributes;
	HishopAttributeValues hishopAttributeValues;

	public HishopAttributes getHishopAttributes() {
		return hishopAttributes;
	}

	public void setHishopAttributes(HishopAttributes hishopAttributes) {
		this.hishopAttributes = hishopAttributes;
	}

	public HishopAttributeValues getHishopAttributeValues() {
		return hishopAttributeValues;
	}

	public void setHishopAttributeValues(HishopAttributeValues hishopAttributeValues) {
		this.hishopAttributeValues = hishopAttributeValues;
	}

}
