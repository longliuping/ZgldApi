package com.zgld.api.beans;

/**
 * HishopFriendlyLinks entity. @author MyEclipse Persistence Tools
 */
public class HishopFriendlyLinks extends AbstractHishopFriendlyLinks implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopFriendlyLinks() {
	}

	/** minimal constructor */
	public HishopFriendlyLinks(Boolean visible, Integer displaySequence) {
		super(visible, displaySequence);
	}

	/** full constructor */
	public HishopFriendlyLinks(String imageUrl, String linkUrl, String title, Boolean visible, Integer displaySequence) {
		super(imageUrl, linkUrl, title, visible, displaySequence);
	}

}
