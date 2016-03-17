package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopProductConsultations entity provides the base persistence
 * definition of the HishopProductConsultations entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopProductConsultations implements
		java.io.Serializable {

	// Fields

	private Integer consultationId;
	private HishopProducts hishopProducts;
	private Integer userId;
	private String userName;
	private String userEmail;
	private String consultationText;
	private Date consultationDate;
	private String replyText;
	private Date replyDate;
	private Integer replyUserId;

	// Constructors

	/** default constructor */
	public AbstractHishopProductConsultations() {
	}

	/** minimal constructor */
	public AbstractHishopProductConsultations(HishopProducts hishopProducts,
			Integer userId, String userName, String userEmail,
			String consultationText, Date consultationDate) {
		this.hishopProducts = hishopProducts;
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.consultationText = consultationText;
		this.consultationDate = consultationDate;
	}

	/** full constructor */
	public AbstractHishopProductConsultations(HishopProducts hishopProducts,
			Integer userId, String userName, String userEmail,
			String consultationText, Date consultationDate,
			String replyText, Date replyDate, Integer replyUserId) {
		this.hishopProducts = hishopProducts;
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.consultationText = consultationText;
		this.consultationDate = consultationDate;
		this.replyText = replyText;
		this.replyDate = replyDate;
		this.replyUserId = replyUserId;
	}

	// Property accessors

	public Integer getConsultationId() {
		return this.consultationId;
	}

	public void setConsultationId(Integer consultationId) {
		this.consultationId = consultationId;
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

	public String getConsultationText() {
		return this.consultationText;
	}

	public void setConsultationText(String consultationText) {
		this.consultationText = consultationText;
	}

	public Date getConsultationDate() {
		return this.consultationDate;
	}

	public void setConsultationDate(Date consultationDate) {
		this.consultationDate = consultationDate;
	}

	public String getReplyText() {
		return this.replyText;
	}

	public void setReplyText(String replyText) {
		this.replyText = replyText;
	}

	public Date getReplyDate() {
		return this.replyDate;
	}

	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}

	public Integer getReplyUserId() {
		return this.replyUserId;
	}

	public void setReplyUserId(Integer replyUserId) {
		this.replyUserId = replyUserId;
	}

}