package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopOrders entity provides the base persistence definition of the
 * HishopOrders entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopOrders implements java.io.Serializable {

	// Fields

	private String orderId;
	private String remark;
	private Integer managerMark;
	private String managerRemark;
	private Double adjustedDiscount;
	private Integer orderStatus;
	private String closeReason;
	private Date orderDate;
	private Date payDate;
	private Date shippingDate;
	private Date finishDate;
	private Integer userId;
	private String username;
	private String emailAddress;
	private String realName;
	private String qq;
	private String wangwang;
	private String msn;
	private String shippingRegion;
	private String address;
	private String zipCode;
	private String shipTo;
	private String telPhone;
	private String cellPhone;
	private Integer shippingModeId;
	private String modeName;
	private Integer realShippingModeId;
	private String realModeName;
	private Integer regionId;
	private Double freight;
	private Double adjustedFreight;
	private String shipOrderNumber;
	private Integer weight;
	private String expressCompanyName;
	private String expressCompanyAbb;
	private Integer paymentTypeId;
	private String paymentType;
	private Double payCharge;
	private Double adjustedPayCharge;
	private Integer refundStatus;
	private Double refundAmount;
	private String refundRemark;
	private String gateway;
	private Double orderTotal;
	private Integer orderPoint;
	private Double orderCostPrice;
	private Double orderProfit;
	private Double actualFreight;
	private Double otherCost;
	private Double optionPrice;
	private Double amount;
	private Integer activityId;
	private String activityName;
	private Boolean eightFree;
	private Boolean procedureFeeFree;
	private Boolean orderOptionFree;
	private Integer discountId;
	private String discountName;
	private Double discountValue;
	private Integer discountValueType;
	private Double discountAmount;
	private String couponName;
	private String couponCode;
	private Double couponAmount;
	private Double couponValue;
	private Integer groupBuyId;
	private Double needPrice;
	private Integer groupBuyStatus;
	private String gatewayOrderId;
	private Boolean isPrinted;
	private String taobaoOrderId;
	private Integer sourceOrder;

	// Constructors

	/** default constructor */
	public AbstractHishopOrders() {
	}
	// Property accessors

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getManagerMark() {
		return this.managerMark;
	}

	public void setManagerMark(Integer managerMark) {
		this.managerMark = managerMark;
	}

	public String getManagerRemark() {
		return this.managerRemark;
	}

	public void setManagerRemark(String managerRemark) {
		this.managerRemark = managerRemark;
	}

	public Double getAdjustedDiscount() {
		return this.adjustedDiscount;
	}

	public void setAdjustedDiscount(Double adjustedDiscount) {
		this.adjustedDiscount = adjustedDiscount;
	}

	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCloseReason() {
		return this.closeReason;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public Date getShippingDate() {
		return this.shippingDate;
	}

	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}

	public Date getFinishDate() {
		return this.finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWangwang() {
		return this.wangwang;
	}

	public void setWangwang(String wangwang) {
		this.wangwang = wangwang;
	}

	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getShippingRegion() {
		return this.shippingRegion;
	}

	public void setShippingRegion(String shippingRegion) {
		this.shippingRegion = shippingRegion;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getShipTo() {
		return this.shipTo;
	}

	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}

	public String getTelPhone() {
		return this.telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public Integer getShippingModeId() {
		return this.shippingModeId;
	}

	public void setShippingModeId(Integer shippingModeId) {
		this.shippingModeId = shippingModeId;
	}

	public String getModeName() {
		return this.modeName;
	}

	public void setModeName(String modeName) {
		this.modeName = modeName;
	}

	public Integer getRealShippingModeId() {
		return this.realShippingModeId;
	}

	public void setRealShippingModeId(Integer realShippingModeId) {
		this.realShippingModeId = realShippingModeId;
	}

	public String getRealModeName() {
		return this.realModeName;
	}

	public void setRealModeName(String realModeName) {
		this.realModeName = realModeName;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public Double getFreight() {
		return this.freight;
	}

	public void setFreight(Double freight) {
		this.freight = freight;
	}

	public Double getAdjustedFreight() {
		return this.adjustedFreight;
	}

	public void setAdjustedFreight(Double adjustedFreight) {
		this.adjustedFreight = adjustedFreight;
	}

	public String getShipOrderNumber() {
		return this.shipOrderNumber;
	}

	public void setShipOrderNumber(String shipOrderNumber) {
		this.shipOrderNumber = shipOrderNumber;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getExpressCompanyName() {
		return this.expressCompanyName;
	}

	public void setExpressCompanyName(String expressCompanyName) {
		this.expressCompanyName = expressCompanyName;
	}

	public String getExpressCompanyAbb() {
		return this.expressCompanyAbb;
	}

	public void setExpressCompanyAbb(String expressCompanyAbb) {
		this.expressCompanyAbb = expressCompanyAbb;
	}

	public Integer getPaymentTypeId() {
		return this.paymentTypeId;
	}

	public void setPaymentTypeId(Integer paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Double getPayCharge() {
		return this.payCharge;
	}

	public void setPayCharge(Double payCharge) {
		this.payCharge = payCharge;
	}

	public Double getAdjustedPayCharge() {
		return this.adjustedPayCharge;
	}

	public void setAdjustedPayCharge(Double adjustedPayCharge) {
		this.adjustedPayCharge = adjustedPayCharge;
	}

	public Integer getRefundStatus() {
		return this.refundStatus;
	}

	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Double getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundRemark() {
		return this.refundRemark;
	}

	public void setRefundRemark(String refundRemark) {
		this.refundRemark = refundRemark;
	}

	public String getGateway() {
		return this.gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public Double getOrderTotal() {
		return this.orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Integer getOrderPoint() {
		return this.orderPoint;
	}

	public void setOrderPoint(Integer orderPoint) {
		this.orderPoint = orderPoint;
	}

	public Double getOrderCostPrice() {
		return this.orderCostPrice;
	}

	public void setOrderCostPrice(Double orderCostPrice) {
		this.orderCostPrice = orderCostPrice;
	}

	public Double getOrderProfit() {
		return this.orderProfit;
	}

	public void setOrderProfit(Double orderProfit) {
		this.orderProfit = orderProfit;
	}

	public Double getActualFreight() {
		return this.actualFreight;
	}

	public void setActualFreight(Double actualFreight) {
		this.actualFreight = actualFreight;
	}

	public Double getOtherCost() {
		return this.otherCost;
	}

	public void setOtherCost(Double otherCost) {
		this.otherCost = otherCost;
	}

	public Double getOptionPrice() {
		return this.optionPrice;
	}

	public void setOptionPrice(Double optionPrice) {
		this.optionPrice = optionPrice;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Boolean getEightFree() {
		return this.eightFree;
	}

	public void setEightFree(Boolean eightFree) {
		this.eightFree = eightFree;
	}

	public Boolean getProcedureFeeFree() {
		return this.procedureFeeFree;
	}

	public void setProcedureFeeFree(Boolean procedureFeeFree) {
		this.procedureFeeFree = procedureFeeFree;
	}

	public Boolean getOrderOptionFree() {
		return this.orderOptionFree;
	}

	public void setOrderOptionFree(Boolean orderOptionFree) {
		this.orderOptionFree = orderOptionFree;
	}

	public Integer getDiscountId() {
		return this.discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	public String getDiscountName() {
		return this.discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public Double getDiscountValue() {
		return this.discountValue;
	}

	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}

	public Integer getDiscountValueType() {
		return this.discountValueType;
	}

	public void setDiscountValueType(Integer discountValueType) {
		this.discountValueType = discountValueType;
	}

	public Double getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getCouponName() {
		return this.couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Double getCouponAmount() {
		return this.couponAmount;
	}

	public void setCouponAmount(Double couponAmount) {
		this.couponAmount = couponAmount;
	}

	public Double getCouponValue() {
		return this.couponValue;
	}

	public void setCouponValue(Double couponValue) {
		this.couponValue = couponValue;
	}

	public Integer getGroupBuyId() {
		return this.groupBuyId;
	}

	public void setGroupBuyId(Integer groupBuyId) {
		this.groupBuyId = groupBuyId;
	}

	public Double getNeedPrice() {
		return this.needPrice;
	}

	public void setNeedPrice(Double needPrice) {
		this.needPrice = needPrice;
	}

	public Integer getGroupBuyStatus() {
		return this.groupBuyStatus;
	}

	public void setGroupBuyStatus(Integer groupBuyStatus) {
		this.groupBuyStatus = groupBuyStatus;
	}

	public String getGatewayOrderId() {
		return this.gatewayOrderId;
	}

	public void setGatewayOrderId(String gatewayOrderId) {
		this.gatewayOrderId = gatewayOrderId;
	}

	public Boolean getIsPrinted() {
		return this.isPrinted;
	}

	public void setIsPrinted(Boolean isPrinted) {
		this.isPrinted = isPrinted;
	}

	public String getTaobaoOrderId() {
		return this.taobaoOrderId;
	}

	public void setTaobaoOrderId(String taobaoOrderId) {
		this.taobaoOrderId = taobaoOrderId;
	}

	public Integer getSourceOrder() {
		return this.sourceOrder;
	}

	public void setSourceOrder(Integer sourceOrder) {
		this.sourceOrder = sourceOrder;
	}
}