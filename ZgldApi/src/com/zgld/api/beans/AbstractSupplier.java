package com.zgld.api.beans;

/**
 * AbstractSupplier entity provides the base persistence definition of the
 * Supplier entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSupplier implements java.io.Serializable {

	// Fields

	private Long supplierId;
	private Integer userId;
	private String supplierName;
	private String comName;
	private String supplierLogoUrl;
	private String supplierDescribe;
	private String supplierUrl1;
	private String supplierUrl2;
	private String supplierUrl3;
	private String supplierUrl4;
	private String businessLicenseNo;
	private String businessLicenseImgUrl;
	private Integer isExamine;
	private String extraStr1;
	private String extraStr2;
	private String extraStr3;
	private Integer supplierOrder;
	private Integer clickNum;
	private Integer commentNum;
	private String idCard;
	private String idCardImgUrl;
	private String linkMan;
	private String linkPhone;
	private Integer supplierRegionId;
	private String qq;
	private String shopMain;
	private String shopAddress;
	private String returnAddress;
	private String bankOfDeposit;
	private String bankOfDepositNo;
	private Integer examineStuart;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractSupplier() {
	}

	/** minimal constructor */
	public AbstractSupplier(String supplierName) {
		this.supplierName = supplierName;
	}

	/** full constructor */
	public AbstractSupplier(Integer userId, String supplierName, String comName, String supplierLogoUrl, String supplierDescribe, String supplierUrl1, String supplierUrl2, String supplierUrl3, String supplierUrl4, String businessLicenseNo, String businessLicenseImgUrl, Integer isExamine, String extraStr1, String extraStr2, String extraStr3, Integer supplierOrder, Integer clickNum, Integer commentNum, String idCard, String idCardImgUrl, String linkMan, String linkPhone, Integer supplierRegionId, String qq, String shopMain, String shopAddress, String returnAddress, String bankOfDeposit, String bankOfDepositNo, Integer examineStuart, String remark) {
		this.userId = userId;
		this.supplierName = supplierName;
		this.comName = comName;
		this.supplierLogoUrl = supplierLogoUrl;
		this.supplierDescribe = supplierDescribe;
		this.supplierUrl1 = supplierUrl1;
		this.supplierUrl2 = supplierUrl2;
		this.supplierUrl3 = supplierUrl3;
		this.supplierUrl4 = supplierUrl4;
		this.businessLicenseNo = businessLicenseNo;
		this.businessLicenseImgUrl = businessLicenseImgUrl;
		this.isExamine = isExamine;
		this.extraStr1 = extraStr1;
		this.extraStr2 = extraStr2;
		this.extraStr3 = extraStr3;
		this.supplierOrder = supplierOrder;
		this.clickNum = clickNum;
		this.commentNum = commentNum;
		this.idCard = idCard;
		this.idCardImgUrl = idCardImgUrl;
		this.linkMan = linkMan;
		this.linkPhone = linkPhone;
		this.supplierRegionId = supplierRegionId;
		this.qq = qq;
		this.shopMain = shopMain;
		this.shopAddress = shopAddress;
		this.returnAddress = returnAddress;
		this.bankOfDeposit = bankOfDeposit;
		this.bankOfDepositNo = bankOfDepositNo;
		this.examineStuart = examineStuart;
		this.remark = remark;
	}

	// Property accessors

	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getComName() {
		return this.comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getSupplierLogoUrl() {
		return this.supplierLogoUrl;
	}

	public void setSupplierLogoUrl(String supplierLogoUrl) {
		this.supplierLogoUrl = supplierLogoUrl;
	}

	public String getSupplierDescribe() {
		return this.supplierDescribe;
	}

	public void setSupplierDescribe(String supplierDescribe) {
		this.supplierDescribe = supplierDescribe;
	}

	public String getSupplierUrl1() {
		return this.supplierUrl1;
	}

	public void setSupplierUrl1(String supplierUrl1) {
		this.supplierUrl1 = supplierUrl1;
	}

	public String getSupplierUrl2() {
		return this.supplierUrl2;
	}

	public void setSupplierUrl2(String supplierUrl2) {
		this.supplierUrl2 = supplierUrl2;
	}

	public String getSupplierUrl3() {
		return this.supplierUrl3;
	}

	public void setSupplierUrl3(String supplierUrl3) {
		this.supplierUrl3 = supplierUrl3;
	}

	public String getSupplierUrl4() {
		return this.supplierUrl4;
	}

	public void setSupplierUrl4(String supplierUrl4) {
		this.supplierUrl4 = supplierUrl4;
	}

	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}

	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

	public String getBusinessLicenseImgUrl() {
		return this.businessLicenseImgUrl;
	}

	public void setBusinessLicenseImgUrl(String businessLicenseImgUrl) {
		this.businessLicenseImgUrl = businessLicenseImgUrl;
	}

	public Integer getIsExamine() {
		return this.isExamine;
	}

	public void setIsExamine(Integer isExamine) {
		this.isExamine = isExamine;
	}

	public String getExtraStr1() {
		return this.extraStr1;
	}

	public void setExtraStr1(String extraStr1) {
		this.extraStr1 = extraStr1;
	}

	public String getExtraStr2() {
		return this.extraStr2;
	}

	public void setExtraStr2(String extraStr2) {
		this.extraStr2 = extraStr2;
	}

	public String getExtraStr3() {
		return this.extraStr3;
	}

	public void setExtraStr3(String extraStr3) {
		this.extraStr3 = extraStr3;
	}

	public Integer getSupplierOrder() {
		return this.supplierOrder;
	}

	public void setSupplierOrder(Integer supplierOrder) {
		this.supplierOrder = supplierOrder;
	}

	public Integer getClickNum() {
		return this.clickNum;
	}

	public void setClickNum(Integer clickNum) {
		this.clickNum = clickNum;
	}

	public Integer getCommentNum() {
		return this.commentNum;
	}

	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getIdCardImgUrl() {
		return this.idCardImgUrl;
	}

	public void setIdCardImgUrl(String idCardImgUrl) {
		this.idCardImgUrl = idCardImgUrl;
	}

	public String getLinkMan() {
		return this.linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public String getLinkPhone() {
		return this.linkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}

	public Integer getSupplierRegionId() {
		return this.supplierRegionId;
	}

	public void setSupplierRegionId(Integer supplierRegionId) {
		this.supplierRegionId = supplierRegionId;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getShopMain() {
		return this.shopMain;
	}

	public void setShopMain(String shopMain) {
		this.shopMain = shopMain;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getReturnAddress() {
		return this.returnAddress;
	}

	public void setReturnAddress(String returnAddress) {
		this.returnAddress = returnAddress;
	}

	public String getBankOfDeposit() {
		return this.bankOfDeposit;
	}

	public void setBankOfDeposit(String bankOfDeposit) {
		this.bankOfDeposit = bankOfDeposit;
	}

	public String getBankOfDepositNo() {
		return this.bankOfDepositNo;
	}

	public void setBankOfDepositNo(String bankOfDepositNo) {
		this.bankOfDepositNo = bankOfDepositNo;
	}

	public Integer getExamineStuart() {
		return this.examineStuart;
	}

	public void setExamineStuart(Integer examineStuart) {
		this.examineStuart = examineStuart;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}