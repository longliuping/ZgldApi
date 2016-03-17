package com.zgld.api.beans;

/**
 * AbstractHishopFavorite entity provides the base persistence definition of the
 * HishopFavorite entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopFavorite implements java.io.Serializable {

	// Fields

	private HishopFavoriteId id;
	private Integer favoriteId;
	private String tags;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractHishopFavorite() {
	}

	/** minimal constructor */
	public AbstractHishopFavorite(HishopFavoriteId id, Integer favoriteId,
			String tags) {
		this.id = id;
		this.favoriteId = favoriteId;
		this.tags = tags;
	}

	/** full constructor */
	public AbstractHishopFavorite(HishopFavoriteId id, Integer favoriteId,
			String tags, String remark) {
		this.id = id;
		this.favoriteId = favoriteId;
		this.tags = tags;
		this.remark = remark;
	}

	// Property accessors

	public HishopFavoriteId getId() {
		return this.id;
	}

	public void setId(HishopFavoriteId id) {
		this.id = id;
	}

	public Integer getFavoriteId() {
		return this.favoriteId;
	}

	public void setFavoriteId(Integer favoriteId) {
		this.favoriteId = favoriteId;
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}