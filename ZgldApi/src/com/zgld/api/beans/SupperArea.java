package com.zgld.api.beans;

/**
 * SupperArea entity. @author MyEclipse Persistence Tools
 */
public class SupperArea extends AbstractSupperArea implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SupperArea() {
	}

	Supplier supplier;

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}
