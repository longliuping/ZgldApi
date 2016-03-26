package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAspnetMemberGrades entity provides the base persistence definition of
 * the AspnetMemberGrades entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAspnetMemberGrades implements java.io.Serializable {

	// Fields

	private Integer gradeId;
	private String name;
	private String description;
	private Integer points;
	private Boolean isDefault;
	private Integer discount;

	// Constructors

	/** default constructor */
	public AbstractAspnetMemberGrades() {
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
}