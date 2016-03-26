package com.zgld.api.beans;

/**
 * HishopExpressTemplates entity. @author MyEclipse Persistence Tools
 */
public class HishopExpressTemplates extends AbstractHishopExpressTemplates implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopExpressTemplates() {
	}

	/** full constructor */
	public HishopExpressTemplates(String expressName, String xmlFile, Boolean isUse) {
		super(expressName, xmlFile, isUse);
	}

}
