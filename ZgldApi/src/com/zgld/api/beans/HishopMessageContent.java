package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopMessageContent entity. @author MyEclipse Persistence Tools
 */
public class HishopMessageContent extends AbstractHishopMessageContent implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopMessageContent() {
	}

	/** full constructor */
	public HishopMessageContent(String title, String content, Timestamp date) {
		super(title, content, date);
	}

}
