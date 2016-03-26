package com.zgld.api.beans;

/**
 * AbstractHishopPromotionMemberGrades entity provides the base persistence
 * definition of the HishopPromotionMemberGrades entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopPromotionMemberGrades implements java.io.Serializable {

	// Fields

	private HishopPromotionMemberGradesId id;

	// Constructors

	/** default constructor */
	public AbstractHishopPromotionMemberGrades() {
	}

	/** full constructor */
	public AbstractHishopPromotionMemberGrades(HishopPromotionMemberGradesId id) {
		this.id = id;
	}

	// Property accessors

	public HishopPromotionMemberGradesId getId() {
		return this.id;
	}

	public void setId(HishopPromotionMemberGradesId id) {
		this.id = id;
	}

}