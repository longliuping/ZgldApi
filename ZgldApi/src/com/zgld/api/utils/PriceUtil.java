package com.zgld.api.utils;

import java.math.BigDecimal;

public class PriceUtil {
	public static String priceY(String price) {
		if (price == null || price.isEmpty()) {
			return "￥0.00";
		} else if (!isNumber(price)) {
			return price;
		} else {
			java.text.NumberFormat formater = java.text.DecimalFormat.getInstance();
			formater.setMaximumFractionDigits(2);
			formater.setMinimumFractionDigits(2);
			String p = formater.format(Double.parseDouble(price));
			return "￥" + p;
		}
	}

	public static String price(String price) {
		if (price == null || price.isEmpty()) {
			return "0.00";
		} else if (!isNumber(price)) {
			return price;
		} else {
			java.text.NumberFormat formater = java.text.DecimalFormat.getInstance();
			formater.setMaximumFractionDigits(2);
			formater.setMinimumFractionDigits(2);
			String p = formater.format(Double.parseDouble(price));
			return "" + p;
		}
	}

	public static String price(Double price) {
		if (price == null) {
			return "0.00";
		} else {
			java.text.NumberFormat formater = java.text.DecimalFormat.getInstance();
			formater.setMaximumFractionDigits(2);
			formater.setMinimumFractionDigits(2);
			String p = formater.format(price);
			return "" + p;
		}
	}

	/**
	 * 判断字符串是否是整数
	 */
	public static boolean isInteger(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isLong(String value) {
		try {
			Long.parseLong(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * 判断字符串是否是浮点数
	 */
	public static boolean isDouble(String value) {
		try {
			Double.parseDouble(value);
			if (value.contains("."))
				return true;
			return false;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * 判断字符串是否是数字
	 */
	public static boolean isNumber(String value) {
		return isInteger(value) || isDouble(value);
	}

	/**
	 * 
	 * 提供精确的小数位四舍五入处理。
	 * 
	 * @param v
	 *            需要四舍五入的数字
	 * 
	 * @param scale
	 *            小数点后保留几位
	 * 
	 * @return 四舍五入后的结果
	 * 
	 */

	public static double roundForNumber(double v, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
