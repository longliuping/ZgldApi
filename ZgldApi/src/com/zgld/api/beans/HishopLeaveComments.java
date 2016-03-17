package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Set;

/**
 * HishopLeaveComments entity. @author MyEclipse Persistence Tools
 */
public class HishopLeaveComments extends AbstractHishopLeaveComments implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopLeaveComments() {
	}

	/** minimal constructor */
	public HishopLeaveComments(String title, String publishContent,
			Timestamp publishDate, Timestamp lastDate, Boolean isReply) {
		super(title, publishContent, publishDate, lastDate, isReply);
	}

	/** full constructor */
	public HishopLeaveComments(Integer userId, String userName, String title,
			String publishContent, Timestamp publishDate, Timestamp lastDate,
			Boolean isReply, Set hishopLeaveCommentReplyses) {
		super(userId, userName, title, publishContent, publishDate, lastDate,
				isReply, hishopLeaveCommentReplyses);
	}

}
