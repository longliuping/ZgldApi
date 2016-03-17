package com.zgld.api.beans;

/**
 * AbstractHishopUserShippingAddresses entity provides the base persistence
 * definition of the HishopUserShippingAddresses entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopUserShippingAddresses implements
		java.io.Serializable {

	// Fields

	private Integer shippingId;
	private Integer userId;
	private Integer regionId;
	private String shipTo;
	private String address;
	private String zipcode;
	private String telPhone;
	private String cellPhone;

	// Constructors

	/** default constructor */
	public AbstractHishopUserShippingAddresses() {
	}
	// Property accessors

	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getShipTo() {
		return this.shipTo;
	}

	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getTelPhone() {
		return this.telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}