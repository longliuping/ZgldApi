package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAspnetMemberGrades entity provides the base persistence definition of
 * the AspnetMemberGrades entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAspnetMemberGrades implements
		java.io.Serializable {

	// Fields

	private Integer gradeId;
	private String name;
	private String description;
	private Integer points;
	private Boolean isDefault;
	private Integer discount;
	private Set hishopPromotionMemberGradeses = new HashSet(0);
	private Set hishopSkumemberPrices = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAspnetMemberGrades() {
	}

	/** minimal constructor */
	public AbstractAspnetMemberGrades(String name, Integer points,
			Boolean isDefault, Integer discount) {
		this.name = name;
		this.points = points;
		this.isDefault = isDefault;
		this.discount = discount;
	}

	/** full constructor */
	public AbstractAspnetMemberGrades(String name, String description,
			Integer points, Boolean isDefault, Integer discount,
			Set hishopPromotionMemberGradeses, Set hishopSkumemberPrices) {
		this.name = name;
		this.description = description;
		this.points = points;
		this.isDefault = isDefault;
		this.discount = discount;
		this.hishopPromotionMemberGradeses = hishopPromotionMemberGradeses;
		this.hishopSkumemberPrices = hishopSkumemberPrices;
	}

	// Property accessors

	public Integer getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getDiscount() {
		return this.discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Set getHishopPromotionMemberGradeses() {
		return this.hishopPromotionMemberGradeses;
	}

	public void setHishopPromotionMemberGradeses(
			Set hishopPromotionMemberGradeses) {
		this.hishopPromotionMemberGradeses = hishopPromotionMemberGradeses;
	}

	public Set getHishopSkumemberPrices() {
		return this.hishopSkumemberPrices;
	}

	public void setHishopSkumemberPrices(Set hishopSkumemberPrices) {
		this.hishopSkumemberPrices = hishopSkumemberPrices;
	}

}