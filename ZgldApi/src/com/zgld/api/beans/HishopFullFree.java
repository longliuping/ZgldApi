package com.zgld.api.beans;

/**
 * HishopFullFree entity. @author MyEclipse Persistence Tools
 */
public class HishopFullFree extends AbstractHishopFullFree implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopFullFree() {
	}

	/** full constructor */
	public HishopFullFree(HishopPromotions hishopPromotions, Double amount,
			Boolean shipChargeFree, Boolean serviceChargeFree,
			Boolean optionFeeFree) {
		super(hishopPromotions, amount, shipChargeFree, serviceChargeFree,
				optionFeeFree);
	}

}
