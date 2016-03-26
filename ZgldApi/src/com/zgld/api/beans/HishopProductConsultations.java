package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopProductConsultations entity. @author MyEclipse Persistence Tools
 */
public class HishopProductConsultations extends AbstractHishopProductConsultations implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopProductConsultations() {
	}

	/** minimal constructor */
	public HishopProductConsultations(HishopProducts hishopProducts, Integer userId, String userName, String userEmail, String consultationText, Timestamp consultationDate) {
		super(hishopProducts, userId, userName, userEmail, consultationText, consultationDate);
	}

	/** full constructor */
	public HishopProductConsultations(HishopProducts hishopProducts, Integer userId, String userName, String userEmail, String consultationText, Timestamp consultationDate, String replyText, Timestamp replyDate, Integer replyUserId) {
		super(hishopProducts, userId, userName, userEmail, consultationText, consultationDate, replyText, replyDate, replyUserId);
	}

}
