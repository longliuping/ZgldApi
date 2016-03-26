package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopApiShorpCartId entity provides the base persistence definition
 * of the HishopApiShorpCartId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopApiShorpCartId implements java.io.Serializable {

	// Fields

	private String apiuserId;
	private String apitype;
	private Integer apiproductId;
	private String apiskuId;
	private Integer apiquantity;
	private Date apitime;

	// Constructors

	/** default constructor */
	public AbstractHishopApiShorpCartId() {
	}

	/** full constructor */
	public AbstractHishopApiShorpCartId(String apiuserId, String apitype, Integer apiproductId, String apiskuId, Integer apiquantity, Date apitime) {
		this.apiuserId = apiuserId;
		this.apitype = apitype;
		this.apiproductId = apiproductId;
		this.apiskuId = apiskuId;
		this.apiquantity = apiquantity;
		this.apitime = apitime;
	}

	// Property accessors

	public String getApiuserId() {
		return this.apiuserId;
	}

	public void setApiuserId(String apiuserId) {
		this.apiuserId = apiuserId;
	}

	public String getApitype() {
		return this.apitype;
	}

	public void setApitype(String apitype) {
		this.apitype = apitype;
	}

	public Integer getApiproductId() {
		return this.apiproductId;
	}

	public void setApiproductId(Integer apiproductId) {
		this.apiproductId = apiproductId;
	}

	public String getApiskuId() {
		return this.apiskuId;
	}

	public void setApiskuId(String apiskuId) {
		this.apiskuId = apiskuId;
	}

	public Integer getApiquantity() {
		return this.apiquantity;
	}

	public void setApiquantity(Integer apiquantity) {
		this.apiquantity = apiquantity;
	}

	public Date getApitime() {
		return this.apitime;
	}

	public void setApitime(Date apitime) {
		this.apitime = apitime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopApiShorpCartId))
			return false;
		AbstractHishopApiShorpCartId castOther = (AbstractHishopApiShorpCartId) other;

		return ((this.getApiuserId() == castOther.getApiuserId()) || (this.getApiuserId() != null && castOther.getApiuserId() != null && this.getApiuserId().equals(castOther.getApiuserId()))) && ((this.getApitype() == castOther.getApitype()) || (this.getApitype() != null && castOther.getApitype() != null && this.getApitype().equals(castOther.getApitype()))) && ((this.getApiproductId() == castOther.getApiproductId()) || (this.getApiproductId() != null && castOther.getApiproductId() != null && this.getApiproductId().equals(castOther.getApiproductId()))) && ((this.getApiskuId() == castOther.getApiskuId()) || (this.getApiskuId() != null && castOther.getApiskuId() != null && this.getApiskuId().equals(castOther.getApiskuId())))
				&& ((this.getApiquantity() == castOther.getApiquantity()) || (this.getApiquantity() != null && castOther.getApiquantity() != null && this.getApiquantity().equals(castOther.getApiquantity()))) && ((this.getApitime() == castOther.getApitime()) || (this.getApitime() != null && castOther.getApitime() != null && this.getApitime().equals(castOther.getApitime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getApiuserId() == null ? 0 : this.getApiuserId().hashCode());
		result = 37 * result + (getApitype() == null ? 0 : this.getApitype().hashCode());
		result = 37 * result + (getApiproductId() == null ? 0 : this.getApiproductId().hashCode());
		result = 37 * result + (getApiskuId() == null ? 0 : this.getApiskuId().hashCode());
		result = 37 * result + (getApiquantity() == null ? 0 : this.getApiquantity().hashCode());
		result = 37 * result + (getApitime() == null ? 0 : this.getApitime().hashCode());
		return result;
	}

}