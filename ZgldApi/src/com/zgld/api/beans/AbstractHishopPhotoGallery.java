package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopPhotoGallery entity provides the base persistence definition of
 * the HishopPhotoGallery entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopPhotoGallery implements
		java.io.Serializable {

	// Fields

	private Integer photoId;
	private Integer categoryId;
	private String photoName;
	private String photoPath;
	private Integer fileSize;
	private Date uploadTime;
	private Date lastUpdateTime;

	// Constructors

	/** default constructor */
	public AbstractHishopPhotoGallery() {
	}

	/** minimal constructor */
	public AbstractHishopPhotoGallery(Integer categoryId, String photoPath,
			Integer fileSize, Date uploadTime, Date lastUpdateTime) {
		this.categoryId = categoryId;
		this.photoPath = photoPath;
		this.fileSize = fileSize;
		this.uploadTime = uploadTime;
		this.lastUpdateTime = lastUpdateTime;
	}

	/** full constructor */
	public AbstractHishopPhotoGallery(Integer categoryId, String photoName,
			String photoPath, Integer fileSize, Date uploadTime,
			Date lastUpdateTime) {
		this.categoryId = categoryId;
		this.photoName = photoName;
		this.photoPath = photoPath;
		this.fileSize = fileSize;
		this.uploadTime = uploadTime;
		this.lastUpdateTime = lastUpdateTime;
	}

	// Property accessors

	public Integer getPhotoId() {
		return this.photoId;
	}

	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getPhotoName() {
		return this.photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getPhotoPath() {
		return this.photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public Integer getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public Date getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

}