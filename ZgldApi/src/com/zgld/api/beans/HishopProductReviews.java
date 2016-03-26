package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopProductReviews entity. @author MyEclipse Persistence Tools
 */
public class HishopProductReviews extends AbstractHishopProductReviews implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopProductReviews() {
	}

	/** full constructor */
	public HishopProductReviews(HishopProducts hishopProducts, Integer userId, String reviewText, String userName, String userEmail, Timestamp reviewDate) {
		super(hishopProducts, userId, reviewText, userName, userEmail, reviewDate);
	}

}
