package com.shahbaz.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.shahbaz.utils.AppConstants;

/**
 * Common class to load all the property file
 * 
 * @author Shahbaz.Khan
 *
 */
public class ApplicationProperties {

	static InputStream input = null;
	static Properties properties = new Properties();

	/**
	 * Pass the key to get the property value
	 * 
	 * @param key
	 * @return
	 */
	public static String getProperty(String key) {

		String propertyFilename = AppConstants.PROPERTY_FILE_PATH;
		try {
			if (input == null) {
				input = new FileInputStream(propertyFilename);
			}
			properties.load(input);

		} catch (IOException e) {
			e.printStackTrace();
		}
		// I am not closing the stream which is a bad practice. But I do not
		// want Property file to be loaded every time method gets called . Code
		// need revised.

		return properties.getProperty(key).trim();

	}

}
