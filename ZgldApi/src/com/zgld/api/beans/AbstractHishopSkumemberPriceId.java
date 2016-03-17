package com.zgld.api.beans;

/**
 * AbstractHishopSkumemberPriceId entity provides the base persistence
 * definition of the HishopSkumemberPriceId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopSkumemberPriceId implements
		java.io.Serializable {

	// Fields

	private HishopSkus hishopSkus;
	private AspnetMemberGrades aspnetMemberGrades;

	// Constructors

	/** default constructor */
	public AbstractHishopSkumemberPriceId() {
	}

	/** full constructor */
	public AbstractHishopSkumemberPriceId(HishopSkus hishopSkus,
			AspnetMemberGrades aspnetMemberGrades) {
		this.hishopSkus = hishopSkus;
		this.aspnetMemberGrades = aspnetMemberGrades;
	}

	// Property accessors

	public HishopSkus getHishopSkus() {
		return this.hishopSkus;
	}

	public void setHishopSkus(HishopSkus hishopSkus) {
		this.hishopSkus = hishopSkus;
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
		if (!(other instanceof AbstractHishopSkumemberPriceId))
			return false;
		AbstractHishopSkumemberPriceId castOther = (AbstractHishopSkumemberPriceId) other;

		return ((this.getHishopSkus() == castOther.getHishopSkus()) || (this
				.getHishopSkus() != null
				&& castOther.getHishopSkus() != null && this.getHishopSkus()
				.equals(castOther.getHishopSkus())))
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
				+ (getHishopSkus() == null ? 0 : this.getHishopSkus()
						.hashCode());
		result = 37
				* result
				+ (getAspnetMemberGrades() == null ? 0 : this
						.getAspnetMemberGrades().hashCode());
		return result;
	}

}