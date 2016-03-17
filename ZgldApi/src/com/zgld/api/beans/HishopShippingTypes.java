package com.zgld.api.beans;

/**
 * HishopShippingTypes entity. @author MyEclipse Persistence Tools
 */
public class HishopShippingTypes extends AbstractHishopShippingTypes implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopShippingTypes() {
	}

	/** minimal constructor */
	public HishopShippingTypes(HishopShippingTemplates hishopShippingTemplates,
			String name, Integer displaySequence) {
		super(hishopShippingTemplates, name, displaySequence);
	}

	/** full constructor */
	public HishopShippingTypes(HishopShippingTemplates hishopShippingTemplates,
			String name, String description, Integer displaySequence) {
		super(hishopShippingTemplates, name, description, displaySequence);
	}

}
