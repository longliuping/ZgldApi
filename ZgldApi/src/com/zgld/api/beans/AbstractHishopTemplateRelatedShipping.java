package com.zgld.api.beans;

/**
 * AbstractHishopTemplateRelatedShipping entity provides the base persistence
 * definition of the HishopTemplateRelatedShipping entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopTemplateRelatedShipping implements
		java.io.Serializable {

	// Fields

	private HishopTemplateRelatedShippingId id;

	// Constructors

	/** default constructor */
	public AbstractHishopTemplateRelatedShipping() {
	}

	/** full constructor */
	public AbstractHishopTemplateRelatedShipping(
			HishopTemplateRelatedShippingId id) {
		this.id = id;
	}

	// Property accessors

	public HishopTemplateRelatedShippingId getId() {
		return this.id;
	}

	public void setId(HishopTemplateRelatedShippingId id) {
		this.id = id;
	}

}