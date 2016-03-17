package com.zgld.api.beans;

import java.util.Set;

/**
 * AspnetMemberGrades entity. @author MyEclipse Persistence Tools
 */
public class AspnetMemberGrades extends AbstractAspnetMemberGrades implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AspnetMemberGrades() {
	}

	/** minimal constructor */
	public AspnetMemberGrades(String name, Integer points, Boolean isDefault,
			Integer discount) {
		super(name, points, isDefault, discount);
	}

	/** full constructor */
	public AspnetMemberGrades(String name, String description, Integer points,
			Boolean isDefault, Integer discount,
			Set hishopPromotionMemberGradeses, Set hishopSkumemberPrices) {
		super(name, description, points, isDefault, discount,
				hishopPromotionMemberGradeses, hishopSkumemberPrices);
	}

}
