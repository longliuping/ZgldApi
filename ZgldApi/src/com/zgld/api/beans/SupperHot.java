package com.zgld.api.beans;

/**
 * SupperHot entity. @author MyEclipse Persistence Tools
 */
public class SupperHot extends AbstractSupperHot implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SupperHot() {
	}

	Supplier supplier;

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}
