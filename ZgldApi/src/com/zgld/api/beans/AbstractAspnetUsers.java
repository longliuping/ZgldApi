package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAspnetUsers entity provides the base persistence definition of the
 * AspnetUsers entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAspnetUsers implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String loweredUserName;
	private String mobilePin;
	private Boolean isAnonymous;
	private Date lastActivityDate;
	private String password;
	private Integer passwordFormat;
	private String passwordSalt;
	private String email;
	private String loweredEmail;
	private String passwordQuestion;
	private String passwordAnswer;
	private Boolean isApproved;
	private Boolean isLockedOut;
	private Date createDate;
	private Date lastLoginDate;
	private Date lastPasswordChangedDate;
	private Date lastLockoutDate;
	private Integer failedPasswordAttemptCount;
	private Date failedPasswordAttemptWindowStart;
	private Integer failedPasswordAnswerAttemptCount;
	private Date failedPasswordAnswerAttemptWindowStart;
	private String comment;
	private Integer gender;
	private Date birthDate;
	private Integer userRole;
	private String openId;
	private String openIdType;
	private String sessionId;
	private Set aspnetUsersInRoleses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAspnetUsers() {
	}

	/** minimal constructor */
	public AbstractAspnetUsers(String userName, String loweredUserName,
			Boolean isAnonymous, Date lastActivityDate, String password,
			Integer passwordFormat, String passwordSalt, Boolean isApproved,
			Boolean isLockedOut, Date createDate, Date lastLoginDate,
			Date lastPasswordChangedDate, Date lastLockoutDate,
			Integer failedPasswordAttemptCount,
			Date failedPasswordAttemptWindowStart,
			Integer failedPasswordAnswerAttemptCount,
			Date failedPasswordAnswerAttemptWindowStart, String sessionId) {
		this.userName = userName;
		this.loweredUserName = loweredUserName;
		this.isAnonymous = isAnonymous;
		this.lastActivityDate = lastActivityDate;
		this.password = password;
		this.passwordFormat = passwordFormat;
		this.passwordSalt = passwordSalt;
		this.isApproved = isApproved;
		this.isLockedOut = isLockedOut;
		this.createDate = createDate;
		this.lastLoginDate = lastLoginDate;
		this.lastPasswordChangedDate = lastPasswordChangedDate;
		this.lastLockoutDate = lastLockoutDate;
		this.failedPasswordAttemptCount = failedPasswordAttemptCount;
		this.failedPasswordAttemptWindowStart = failedPasswordAttemptWindowStart;
		this.failedPasswordAnswerAttemptCount = failedPasswordAnswerAttemptCount;
		this.failedPasswordAnswerAttemptWindowStart = failedPasswordAnswerAttemptWindowStart;
		this.sessionId = sessionId;
	}

	/** full constructor */
	public AbstractAspnetUsers(String userName, String loweredUserName,
			String mobilePin, Boolean isAnonymous, Date lastActivityDate,
			String password, Integer passwordFormat, String passwordSalt,
			String email, String loweredEmail, String passwordQuestion,
			String passwordAnswer, Boolean isApproved, Boolean isLockedOut,
			Date createDate, Date lastLoginDate,
			Date lastPasswordChangedDate, Date lastLockoutDate,
			Integer failedPasswordAttemptCount,
			Date failedPasswordAttemptWindowStart,
			Integer failedPasswordAnswerAttemptCount,
			Date failedPasswordAnswerAttemptWindowStart, String comment,
			Integer gender, Date birthDate, Integer userRole,
			String openId, String openIdType, String sessionId,
			Set aspnetUsersInRoleses) {
		this.userName = userName;
		this.loweredUserName = loweredUserName;
		this.mobilePin = mobilePin;
		this.isAnonymous = isAnonymous;
		this.lastActivityDate = lastActivityDate;
		this.password = password;
		this.passwordFormat = passwordFormat;
		this.passwordSalt = passwordSalt;
		this.email = email;
		this.loweredEmail = loweredEmail;
		this.passwordQuestion = passwordQuestion;
		this.passwordAnswer = passwordAnswer;
		this.isApproved = isApproved;
		this.isLockedOut = isLockedOut;
		this.createDate = createDate;
		this.lastLoginDate = lastLoginDate;
		this.lastPasswordChangedDate = lastPasswordChangedDate;
		this.lastLockoutDate = lastLockoutDate;
		this.failedPasswordAttemptCount = failedPasswordAttemptCount;
		this.failedPasswordAttemptWindowStart = failedPasswordAttemptWindowStart;
		this.failedPasswordAnswerAttemptCount = failedPasswordAnswerAttemptCount;
		this.failedPasswordAnswerAttemptWindowStart = failedPasswordAnswerAttemptWindowStart;
		this.comment = comment;
		this.gender = gender;
		this.birthDate = birthDate;
		this.userRole = userRole;
		this.openId = openId;
		this.openIdType = openIdType;
		this.sessionId = sessionId;
		this.aspnetUsersInRoleses = aspnetUsersInRoleses;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoweredUserName() {
		return this.loweredUserName;
	}

	public void setLoweredUserName(String loweredUserName) {
		this.loweredUserName = loweredUserName;
	}

	public String getMobilePin() {
		return this.mobilePin;
	}

	public void setMobilePin(String mobilePin) {
		this.mobilePin = mobilePin;
	}

	public Boolean getIsAnonymous() {
		return this.isAnonymous;
	}

	public void setIsAnonymous(Boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}

	public Date getLastActivityDate() {
		return this.lastActivityDate;
	}

	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPasswordFormat() {
		return this.passwordFormat;
	}

	public void setPasswordFormat(Integer passwordFormat) {
		this.passwordFormat = passwordFormat;
	}

	public String getPasswordSalt() {
		return this.passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoweredEmail() {
		return this.loweredEmail;
	}

	public void setLoweredEmail(String loweredEmail) {
		this.loweredEmail = loweredEmail;
	}

	public String getPasswordQuestion() {
		return this.passwordQuestion;
	}

	public void setPasswordQuestion(String passwordQuestion) {
		this.passwordQuestion = passwordQuestion;
	}

	public String getPasswordAnswer() {
		return this.passwordAnswer;
	}

	public void setPasswordAnswer(String passwordAnswer) {
		this.passwordAnswer = passwordAnswer;
	}

	public Boolean getIsApproved() {
		return this.isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}

	public Boolean getIsLockedOut() {
		return this.isLockedOut;
	}

	public void setIsLockedOut(Boolean isLockedOut) {
		this.isLockedOut = isLockedOut;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Date getLastPasswordChangedDate() {
		return this.lastPasswordChangedDate;
	}

	public void setLastPasswordChangedDate(Date lastPasswordChangedDate) {
		this.lastPasswordChangedDate = lastPasswordChangedDate;
	}

	public Date getLastLockoutDate() {
		return this.lastLockoutDate;
	}

	public void setLastLockoutDate(Date lastLockoutDate) {
		this.lastLockoutDate = lastLockoutDate;
	}

	public Integer getFailedPasswordAttemptCount() {
		return this.failedPasswordAttemptCount;
	}

	public void setFailedPasswordAttemptCount(Integer failedPasswordAttemptCount) {
		this.failedPasswordAttemptCount = failedPasswordAttemptCount;
	}

	public Date getFailedPasswordAttemptWindowStart() {
		return this.failedPasswordAttemptWindowStart;
	}

	public void setFailedPasswordAttemptWindowStart(
			Date failedPasswordAttemptWindowStart) {
		this.failedPasswordAttemptWindowStart = failedPasswordAttemptWindowStart;
	}

	public Integer getFailedPasswordAnswerAttemptCount() {
		return this.failedPasswordAnswerAttemptCount;
	}

	public void setFailedPasswordAnswerAttemptCount(
			Integer failedPasswordAnswerAttemptCount) {
		this.failedPasswordAnswerAttemptCount = failedPasswordAnswerAttemptCount;
	}

	public Date getFailedPasswordAnswerAttemptWindowStart() {
		return this.failedPasswordAnswerAttemptWindowStart;
	}

	public void setFailedPasswordAnswerAttemptWindowStart(
			Date failedPasswordAnswerAttemptWindowStart) {
		this.failedPasswordAnswerAttemptWindowStart = failedPasswordAnswerAttemptWindowStart;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getUserRole() {
		return this.userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOpenIdType() {
		return this.openIdType;
	}

	public void setOpenIdType(String openIdType) {
		this.openIdType = openIdType;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Set getAspnetUsersInRoleses() {
		return this.aspnetUsersInRoleses;
	}

	public void setAspnetUsersInRoleses(Set aspnetUsersInRoleses) {
		this.aspnetUsersInRoleses = aspnetUsersInRoleses;
	}

}