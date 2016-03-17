package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopCellphoneQueue entity provides the base persistence definition
 * of the HishopCellphoneQueue entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopCellphoneQueue implements
		java.io.Serializable {

	// Fields

	private String cellphoneId;
	private String cellphoneNumber;
	private String subject;
	private Date nextTryTime;
	private Integer numberOfTries;

	// Constructors

	/** default constructor */
	public AbstractHishopCellphoneQueue() {
	}

	/** full constructor */
	public AbstractHishopCellphoneQueue(String cellphoneNumber, String subject,
			Date nextTryTime, Integer numberOfTries) {
		this.cellphoneNumber = cellphoneNumber;
		this.subject = subject;
		this.nextTryTime = nextTryTime;
		this.numberOfTries = numberOfTries;
	}

	// Property accessors

	public String getCellphoneId() {
		return this.cellphoneId;
	}

	public void setCellphoneId(String cellphoneId) {
		this.cellphoneId = cellphoneId;
	}

	public String getCellphoneNumber() {
		return this.cellphoneNumber;
	}

	public void setCellphoneNumber(String cellphoneNumber) {
		this.cellphoneNumber = cellphoneNumber;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getNextTryTime() {
		return this.nextTryTime;
	}

	public void setNextTryTime(Date nextTryTime) {
		this.nextTryTime = nextTryTime;
	}

	public Integer getNumberOfTries() {
		return this.numberOfTries;
	}

	public void setNumberOfTries(Integer numberOfTries) {
		this.numberOfTries = numberOfTries;
	}

}