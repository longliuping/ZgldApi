package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopAffiche entity. @author MyEclipse Persistence Tools
 */
public class HishopAffiche extends AbstractHishopAffiche implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopAffiche() {
	}

	/** minimal constructor */
	public HishopAffiche(String content, Timestamp addedDate) {
		super(content, addedDate);
	}

	/** full constructor */
	public HishopAffiche(String title, String content, Timestamp addedDate) {
		super(title, content, addedDate);
	}

}
