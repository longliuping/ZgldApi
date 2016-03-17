package com.zgld.api.utils;

import java.io.IOException;
import java.util.Properties;

public class AppParametersConfig {
	private static boolean isDebugModelRunning = false;

	private static Properties prop = new Properties();

	static {
		try {
			prop.load(AppParametersConfig.class.getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean isDebugModel() {
		return isDebugModelRunning;
	}

	public static String getParameter(String paramString) {
		String str = prop.getProperty(paramString);
		if (str != null)
			str.trim();
		return str;
	}

}