package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopShippingTemplates entity provides the base persistence
 * definition of the HishopShippingTemplates entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopShippingTemplates implements java.io.Serializable {

	// Fields

	private Integer templateId;
	private String templateName;
	private Integer weight;
	private Integer addWeight;
	private Double price;
	private Double addPrice;
	private Set hishopShippingTypeses = new HashSet(0);
	private Set hishopShippingTypeGroupses = new HashSet(0);
	private Set hishopShippingRegionses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHishopShippingTemplates() {
	}

	/** minimal constructor */
	public AbstractHishopShippingTemplates(String templateName, Integer weight, Double price) {
		this.templateName = templateName;
		this.weight = weight;
		this.price = price;
	}

	/** full constructor */
	public AbstractHishopShippingTemplates(String templateName, Integer weight, Integer addWeight, Double price, Double addPrice, Set hishopShippingTypeses, Set hishopShippingTypeGroupses, Set hishopShippingRegionses) {
		this.templateName = templateName;
		this.weight = weight;
		this.addWeight = addWeight;
		this.price = price;
		this.addPrice = addPrice;
		this.hishopShippingTypeses = hishopShippingTypeses;
		this.hishopShippingTypeGroupses = hishopShippingTypeGroupses;
		this.hishopShippingRegionses = hishopShippingRegionses;
	}

	// Property accessors

	public Integer getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getAddWeight() {
		return this.addWeight;
	}

	public void setAddWeight(Integer addWeight) {
		this.addWeight = addWeight;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getAddPrice() {
		return this.addPrice;
	}

	public void setAddPrice(Double addPrice) {
		this.addPrice = addPrice;
	}

	public Set getHishopShippingTypeses() {
		return this.hishopShippingTypeses;
	}

	public void setHishopShippingTypeses(Set hishopShippingTypeses) {
		this.hishopShippingTypeses = hishopShippingTypeses;
	}

	public Set getHishopShippingTypeGroupses() {
		return this.hishopShippingTypeGroupses;
	}

	public void setHishopShippingTypeGroupses(Set hishopShippingTypeGroupses) {
		this.hishopShippingTypeGroupses = hishopShippingTypeGroupses;
	}

	public Set getHishopShippingRegionses() {
		return this.hishopShippingRegionses;
	}

	public void setHishopShippingRegionses(Set hishopShippingRegionses) {
		this.hishopShippingRegionses = hishopShippingRegionses;
	}

}