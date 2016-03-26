package com.zgld.api.beans;

/**
 * HishopShippers entity. @author MyEclipse Persistence Tools
 */
public class HishopShippers extends AbstractHishopShippers implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopShippers() {
	}

	/** minimal constructor */
	public HishopShippers(Integer distributorUserId, Boolean isDefault, String shipperTag, String shipperName, Integer regionId, String address, String zipcode) {
		super(distributorUserId, isDefault, shipperTag, shipperName, regionId, address, zipcode);
	}

	/** full constructor */
	public HishopShippers(Integer distributorUserId, Boolean isDefault, String shipperTag, String shipperName, Integer regionId, String address, String cellPhone, String telPhone, String zipcode, String remark) {
		super(distributorUserId, isDefault, shipperTag, shipperName, regionId, address, cellPhone, telPhone, zipcode, remark);
	}

}
