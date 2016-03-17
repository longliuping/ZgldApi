package com.zgld.api.beans;

/**
 * HishopGifts entity. @author MyEclipse Persistence Tools
 */
public class HishopGifts extends AbstractHishopGifts implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopGifts() {
	}

	/** minimal constructor */
	public HishopGifts(String name, Integer needPoint) {
		super(name, needPoint);
	}

	/** full constructor */
	public HishopGifts(String name, String shortDescription, String unit,
			String longDescription, String title, String metaDescription,
			String metaKeywords, Double costPrice, String imageUrl,
			String thumbnailUrl40, String thumbnailUrl60,
			String thumbnailUrl100, String thumbnailUrl160,
			String thumbnailUrl180, String thumbnailUrl220,
			String thumbnailUrl310, String thumbnailUrl410, Double marketPrice,
			Integer needPoint) {
		super(name, shortDescription, unit, longDescription, title,
				metaDescription, metaKeywords, costPrice, imageUrl,
				thumbnailUrl40, thumbnailUrl60, thumbnailUrl100,
				thumbnailUrl160, thumbnailUrl180, thumbnailUrl220,
				thumbnailUrl310, thumbnailUrl410, marketPrice, needPoint);
	}

}
