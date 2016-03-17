package com.zgld.api.beans;

import java.util.Set;

/**
 * AspnetMembers entity. @author MyEclipse Persistence Tools
 */
public class AspnetMembers extends AbstractAspnetMembers implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AspnetMembers() {
	}

	/** minimal constructor */
	public AspnetMembers(Integer gradeId, Boolean isOpenBalance,
			String tradePassword, String tradePasswordSalt,
			Integer tradePasswordFormat, Integer orderNumber,
			Double expenditure, Integer points, Double balance,
			Double requestBalance) {
		super(gradeId, isOpenBalance, tradePassword, tradePasswordSalt,
				tradePasswordFormat, orderNumber, expenditure, points, balance,
				requestBalance);
	}

	/** full constructor */
	public AspnetMembers(Integer gradeId, Integer referralUserId,
			Boolean isOpenBalance, String tradePassword,
			String tradePasswordSalt, Integer tradePasswordFormat,
			Integer orderNumber, Double expenditure, Integer points,
			Double balance, Double requestBalance, Integer topRegionId,
			Integer regionId, String realName, String address, String zipcode,
			String telPhone, String cellPhone, String qq, String wangwang,
			String msn, Set hishopUserShippingAddresseses, Set hishopFavorites,
			Set hishopInpourRequests, Set hishopBalanceDrawRequests,
			Set hishopBalanceDetailses, Set hishopPointDetailses,
			Set hishopShoppingCartses, Set hishopGiftShoppingCartses) {
		super(gradeId, referralUserId, isOpenBalance, tradePassword,
				tradePasswordSalt, tradePasswordFormat, orderNumber,
				expenditure, points, balance, requestBalance, topRegionId,
				regionId, realName, address, zipcode, telPhone, cellPhone, qq,
				wangwang, msn, hishopUserShippingAddresseses, hishopFavorites,
				hishopInpourRequests, hishopBalanceDrawRequests,
				hishopBalanceDetailses, hishopPointDetailses,
				hishopShoppingCartses, hishopGiftShoppingCartses);
	}

}
