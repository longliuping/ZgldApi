package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopHotkeywords entity provides the base persistence definition of
 * the HishopHotkeywords entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopHotkeywords implements java.io.Serializable {

	// Fields

	private Integer hid;
	private HishopCategories hishopCategories;
	private String keywords;
	private Date searchTime;
	private Date lasttime;
	private Integer frequency;

	// Constructors

	/** default constructor */
	public AbstractHishopHotkeywords() {
	}

	/** full constructor */
	public AbstractHishopHotkeywords(HishopCategories hishopCategories,
			String keywords, Date searchTime, Date lasttime,
			Integer frequency) {
		this.hishopCategories = hishopCategories;
		this.keywords = keywords;
		this.searchTime = searchTime;
		this.lasttime = lasttime;
		this.frequency = frequency;
	}

	// Property accessors

	public Integer getHid() {
		return this.hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public HishopCategories getHishopCategories() {
		return this.hishopCategories;
	}

	public void setHishopCategories(HishopCategories hishopCategories) {
		this.hishopCategories = hishopCategories;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Date getSearchTime() {
		return this.searchTime;
	}

	public void setSearchTime(Date searchTime) {
		this.searchTime = searchTime;
	}

	public Date getLasttime() {
		return this.lasttime;
	}

	public void setLasttime(Date lasttime) {
		this.lasttime = lasttime;
	}

	public Integer getFrequency() {
		return this.frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

}