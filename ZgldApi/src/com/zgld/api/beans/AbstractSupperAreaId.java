package com.zgld.api.beans;

/**
 * AbstractSupperAreaId entity provides the base persistence definition of the
 * SupperAreaId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSupperAreaId implements java.io.Serializable {

	// Fields

	private Integer userid;
	private Integer areaid;

	// Constructors

	/** default constructor */
	public AbstractSupperAreaId() {
	}

	/** full constructor */
	public AbstractSupperAreaId(Integer userid, Integer areaid) {
		this.userid = userid;
		this.areaid = areaid;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getAreaid() {
		return this.areaid;
	}

	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSupperAreaId))
			return false;
		AbstractSupperAreaId castOther = (AbstractSupperAreaId) other;

		return ((this.getUserid() == castOther.getUserid()) || (this
				.getUserid() != null && castOther.getUserid() != null && this
				.getUserid().equals(castOther.getUserid())))
				&& ((this.getAreaid() == castOther.getAreaid()) || (this
						.getAreaid() != null && castOther.getAreaid() != null && this
						.getAreaid().equals(castOther.getAreaid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUserid() == null ? 0 : this.getUserid().hashCode());
		result = 37 * result
				+ (getAreaid() == null ? 0 : this.getAreaid().hashCode());
		return result;
	}

}