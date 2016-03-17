package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopLeaveCommentReplys entity. @author MyEclipse Persistence Tools
 */
public class HishopLeaveCommentReplys extends AbstractHishopLeaveCommentReplys
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopLeaveCommentReplys() {
	}

	/** full constructor */
	public HishopLeaveCommentReplys(HishopLeaveComments hishopLeaveComments,
			Integer userId, String replyContent, Timestamp replyDate) {
		super(hishopLeaveComments, userId, replyContent, replyDate);
	}

}
