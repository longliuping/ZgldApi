package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopPhotoGallery entity. @author MyEclipse Persistence Tools
 */
public class HishopPhotoGallery extends AbstractHishopPhotoGallery implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopPhotoGallery() {
	}

	/** minimal constructor */
	public HishopPhotoGallery(Integer categoryId, String photoPath,
			Integer fileSize, Timestamp uploadTime, Timestamp lastUpdateTime) {
		super(categoryId, photoPath, fileSize, uploadTime, lastUpdateTime);
	}

	/** full constructor */
	public HishopPhotoGallery(Integer categoryId, String photoName,
			String photoPath, Integer fileSize, Timestamp uploadTime,
			Timestamp lastUpdateTime) {
		super(categoryId, photoName, photoPath, fileSize, uploadTime,
				lastUpdateTime);
	}

}
