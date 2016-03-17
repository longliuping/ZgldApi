package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopProductReviews entity provides the base persistence definition
 * of the HishopProductReviews entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopProductReviews implements
		java.io.Serializable {

	// Fields

	private Long reviewId;
	private HishopProducts hishopProducts;
	private Integer userId;
	private String reviewText;
	private String userName;
	private String userEmail;
	private Date reviewDate;

	// Constructors

	/** default constructor */
	public AbstractHishopProductReviews() {
	}

	/** full constructor */
	public AbstractHishopProductReviews(HishopProducts hishopProducts,
			Integer userId, String reviewText, String userName,
			String userEmail, Date reviewDate) {
		this.hishopProducts = hishopProducts;
		this.userId = userId;
		this.reviewText = reviewText;
		this.userName = userName;
		this.userEmail = userEmail;
		this.reviewDate = reviewDate;
	}

	// Property accessors

	public Long getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public HishopProducts getHishopProducts() {
		return this.hishopProducts;
	}

	public void setHishopProducts(HishopProducts hishopProducts) {
		this.hishopProducts = hishopProducts;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getReviewText() {
		return this.reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

}