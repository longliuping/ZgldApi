package com.zgld.api.beans;

/**
 * AbstractHishopApiShorpCart entity provides the base persistence definition of
 * the HishopApiShorpCart entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopApiShorpCart implements java.io.Serializable {

	// Fields

	private HishopApiShorpCartId id;

	// Constructors

	/** default constructor */
	public AbstractHishopApiShorpCart() {
	}

	/** full constructor */
	public AbstractHishopApiShorpCart(HishopApiShorpCartId id) {
		this.id = id;
	}

	// Property accessors

	public HishopApiShorpCartId getId() {
		return this.id;
	}

	public void setId(HishopApiShorpCartId id) {
		this.id = id;
	}

}