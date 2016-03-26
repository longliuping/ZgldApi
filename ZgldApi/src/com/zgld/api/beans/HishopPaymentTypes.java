package com.zgld.api.beans;

/**
 * HishopPaymentTypes entity. @author MyEclipse Persistence Tools
 */
public class HishopPaymentTypes extends AbstractHishopPaymentTypes implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopPaymentTypes() {
	}

	/** minimal constructor */
	public HishopPaymentTypes(String name, Integer displaySequence, Boolean isUseInpour, Double charge, Boolean isPercent, String applicationType) {
		super(name, displaySequence, isUseInpour, charge, isPercent, applicationType);
	}

	/** full constructor */
	public HishopPaymentTypes(String name, String description, String gateway, Integer displaySequence, Boolean isUseInpour, Double charge, Boolean isPercent, String applicationType, String settings) {
		super(name, description, gateway, displaySequence, isUseInpour, charge, isPercent, applicationType, settings);
	}

}
