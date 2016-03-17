package com.zgld.api.beans;

/**
 * AbstractHishopSuppliers entity provides the base persistence definition of
 * the HishopSuppliers entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopSuppliers implements java.io.Serializable {

	// Fields

	private String supplierName;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractHishopSuppliers() {
	}

	/** full constructor */
	public AbstractHishopSuppliers(String remark) {
		this.remark = remark;
	}

	// Property accessors

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}