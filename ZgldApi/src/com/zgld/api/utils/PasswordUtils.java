package com.zgld.api.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class PasswordUtils {
	/**
	 * BASE64解密
	 * 
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static byte[] decryptBASE64(String key) throws Exception {
		return (new BASE64Decoder()).decodeBuffer(key);
	}

	/**
	 * BASE64加密
	 * 
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String encryptBASE64(byte[] key) throws Exception {
		return (new BASE64Encoder()).encodeBuffer(key);
	}

	/**
	 * MD5加密
	 * 
	 * @param str
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// 确定计算方法
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		// 加密后的字符�?
		return base64en.encode(md5.digest(str.getBytes("utf-8")));
	}

	public static void main(String[] args) {
		try {
			String inputStr = "�?��加密";
			System.err.println("原文:\n" + inputStr);

			byte[] inputData = inputStr.getBytes();
			String code = encryptBASE64(inputData);

			System.err.println("BASE64加密�?\n" + code);

			byte[] output = decryptBASE64(code);

			String outputStr = new String(output);

			System.err.println("BASE64解密�?\n" + outputStr);
			System.out.println("MD5(123456):" + EncoderByMd5("123456"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
