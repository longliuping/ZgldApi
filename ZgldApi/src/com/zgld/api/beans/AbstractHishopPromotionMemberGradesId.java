package com.zgld.api.beans;

/**
 * AbstractHishopPromotionMemberGradesId entity provides the base persistence
 * definition of the HishopPromotionMemberGradesId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopPromotionMemberGradesId implements
		java.io.Serializable {

	// Fields

	private HishopPromotions hishopPromotions;
	private AspnetMemberGrades aspnetMemberGrades;

	// Constructors

	/** default constructor */
	public AbstractHishopPromotionMemberGradesId() {
	}

	/** full constructor */
	public AbstractHishopPromotionMemberGradesId(
			HishopPromotions hishopPromotions,
			AspnetMemberGrades aspnetMemberGrades) {
		this.hishopPromotions = hishopPromotions;
		this.aspnetMemberGrades = aspnetMemberGrades;
	}

	// Property accessors

	public HishopPromotions getHishopPromotions() {
		return this.hishopPromotions;
	}

	public void setHishopPromotions(HishopPromotions hishopPromotions) {
		this.hishopPromotions = hishopPromotions;
	}

	public AspnetMemberGrades getAspnetMemberGrades() {
		return this.aspnetMemberGrades;
	}

	public void setAspnetMemberGrades(AspnetMemberGrades aspnetMemberGrades) {
		this.aspnetMemberGrades = aspnetMemberGrades;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopPromotionMemberGradesId))
			return false;
		AbstractHishopPromotionMemberGradesId castOther = (AbstractHishopPromotionMemberGradesId) other;

		return ((this.getHishopPromotions() == castOther.getHishopPromotions()) || (this
				.getHishopPromotions() != null
				&& castOther.getHishopPromotions() != null && this
				.getHishopPromotions().equals(castOther.getHishopPromotions())))
				&& ((this.getAspnetMemberGrades() == castOther
						.getAspnetMemberGrades()) || (this
						.getAspnetMemberGrades() != null
						&& castOther.getAspnetMemberGrades() != null && this
						.getAspnetMemberGrades().equals(
								castOther.getAspnetMemberGrades())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getHishopPromotions() == null ? 0 : this
						.getHishopPromotions().hashCode());
		result = 37
				* result
				+ (getAspnetMemberGrades() == null ? 0 : this
						.getAspnetMemberGrades().hashCode());
		return result;
	}

}