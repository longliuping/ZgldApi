package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopHotkeywords entity. @author MyEclipse Persistence Tools
 */
public class HishopHotkeywords extends AbstractHishopHotkeywords implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopHotkeywords() {
	}

	/** full constructor */
	public HishopHotkeywords(HishopCategories hishopCategories,
			String keywords, Timestamp searchTime, Timestamp lasttime,
			Integer frequency) {
		super(hishopCategories, keywords, searchTime, lasttime, frequency);
	}

}
