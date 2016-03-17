package com.zgld.api.beans;

/**
 * HishopPromotionMemberGradesId entity. @author MyEclipse Persistence Tools
 */
public class HishopPromotionMemberGradesId extends
		AbstractHishopPromotionMemberGradesId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopPromotionMemberGradesId() {
	}

	/** full constructor */
	public HishopPromotionMemberGradesId(HishopPromotions hishopPromotions,
			AspnetMemberGrades aspnetMemberGrades) {
		super(hishopPromotions, aspnetMemberGrades);
	}

}
