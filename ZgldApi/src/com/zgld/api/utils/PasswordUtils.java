package com.zgld.api.utils;

import java.util.UUID;

public class PasswordUtils {

	public static String EncoderByMd5() {
		return UUID.randomUUID().toString();
	}
}
