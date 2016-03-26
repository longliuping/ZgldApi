package com.zgld.api.beans;

/**
 * AbstractHishopShippers entity provides the base persistence definition of the
 * HishopShippers entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopShippers implements java.io.Serializable {

	// Fields

	private Integer shipperId;
	private Integer distributorUserId;
	private Boolean isDefault;
	private String shipperTag;
	private String shipperName;
	private Integer regionId;
	private String address;
	private String cellPhone;
	private String telPhone;
	private String zipcode;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractHishopShippers() {
	}

	/** minimal constructor */
	public AbstractHishopShippers(Integer distributorUserId, Boolean isDefault, String shipperTag, String shipperName, Integer regionId, String address, String zipcode) {
		this.distributorUserId = distributorUserId;
		this.isDefault = isDefault;
		this.shipperTag = shipperTag;
		this.shipperName = shipperName;
		this.regionId = regionId;
		this.address = address;
		this.zipcode = zipcode;
	}

	/** full constructor */
	public AbstractHishopShippers(Integer distributorUserId, Boolean isDefault, String shipperTag, String shipperName, Integer regionId, String address, String cellPhone, String telPhone, String zipcode, String remark) {
		this.distributorUserId = distributorUserId;
		this.isDefault = isDefault;
		this.shipperTag = shipperTag;
		this.shipperName = shipperName;
		this.regionId = regionId;
		this.address = address;
		this.cellPhone = cellPhone;
		this.telPhone = telPhone;
		this.zipcode = zipcode;
		this.remark = remark;
	}

	// Property accessors

	public Integer getShipperId() {
		return this.shipperId;
	}

	public void setShipperId(Integer shipperId) {
		this.shipperId = shipperId;
	}

	public Integer getDistributorUserId() {
		return this.distributorUserId;
	}

	public void setDistributorUserId(Integer distributorUserId) {
		this.distributorUserId = distributorUserId;
	}

	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getShipperTag() {
		return this.shipperTag;
	}

	public void setShipperTag(String shipperTag) {
		this.shipperTag = shipperTag;
	}

	public String getShipperName() {
		return this.shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getTelPhone() {
		return this.telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}