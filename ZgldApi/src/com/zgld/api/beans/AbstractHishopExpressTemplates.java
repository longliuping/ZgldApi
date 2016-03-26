package com.zgld.api.beans;

/**
 * AbstractHishopExpressTemplates entity provides the base persistence
 * definition of the HishopExpressTemplates entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopExpressTemplates implements java.io.Serializable {

	// Fields

	private Integer expressId;
	private String expressName;
	private String xmlFile;
	private Boolean isUse;

	// Constructors

	/** default constructor */
	public AbstractHishopExpressTemplates() {
	}

	/** full constructor */
	public AbstractHishopExpressTemplates(String expressName, String xmlFile, Boolean isUse) {
		this.expressName = expressName;
		this.xmlFile = xmlFile;
		this.isUse = isUse;
	}

	// Property accessors

	public Integer getExpressId() {
		return this.expressId;
	}

	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}

	public String getExpressName() {
		return this.expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public String getXmlFile() {
		return this.xmlFile;
	}

	public void setXmlFile(String xmlFile) {
		this.xmlFile = xmlFile;
	}

	public Boolean getIsUse() {
		return this.isUse;
	}

	public void setIsUse(Boolean isUse) {
		this.isUse = isUse;
	}

}