package com.zgld.api.beans;

/**
 * HishopFavorite entity. @author MyEclipse Persistence Tools
 */
public class HishopFavorite extends AbstractHishopFavorite implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopFavorite() {
	}

	/** minimal constructor */
	public HishopFavorite(HishopFavoriteId id, Integer favoriteId, String tags) {
		super(id, favoriteId, tags);
	}

	/** full constructor */
	public HishopFavorite(HishopFavoriteId id, Integer favoriteId, String tags,
			String remark) {
		super(id, favoriteId, tags, remark);
	}

}
