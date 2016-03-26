package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopApiShorpCartId entity. @author MyEclipse Persistence Tools
 */
public class HishopApiShorpCartId extends AbstractHishopApiShorpCartId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopApiShorpCartId() {
	}

	/** full constructor */
	public HishopApiShorpCartId(String apiuserId, String apitype, Integer apiproductId, String apiskuId, Integer apiquantity, Timestamp apitime) {
		super(apiuserId, apitype, apiproductId, apiskuId, apiquantity, apitime);
	}

}
