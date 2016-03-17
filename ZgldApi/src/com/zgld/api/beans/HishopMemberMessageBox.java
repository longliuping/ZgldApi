package com.zgld.api.beans;

/**
 * HishopMemberMessageBox entity. @author MyEclipse Persistence Tools
 */
public class HishopMemberMessageBox extends AbstractHishopMemberMessageBox
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopMemberMessageBox() {
	}

	/** full constructor */
	public HishopMemberMessageBox(Long contentId, String sernder,
			String accepter, Boolean isRead) {
		super(contentId, sernder, accepter, isRead);
	}

}
