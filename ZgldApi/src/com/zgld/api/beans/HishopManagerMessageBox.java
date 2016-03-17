package com.zgld.api.beans;

/**
 * HishopManagerMessageBox entity. @author MyEclipse Persistence Tools
 */
public class HishopManagerMessageBox extends AbstractHishopManagerMessageBox
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopManagerMessageBox() {
	}

	/** full constructor */
	public HishopManagerMessageBox(Long contentId, String sernder,
			String accepter, Boolean isRead) {
		super(contentId, sernder, accepter, isRead);
	}

}
