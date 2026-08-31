package com.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	public static void getProperty() {

		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("config/QA.properties");
		Properties properties = new Properties();
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
