package com.testNG.testpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropertiesDemo {
	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("/Users/kamini/Documents/newworkspace1/SeleniumWeekend/configproperties");
	 Properties prop = new Properties();
	 prop.load(fis);
	 String usernameValue = prop.getProperty("username");
	 String passwordValue = prop.getProperty("password");
	 System.out.println(usernameValue + ":" + passwordValue);
	 
	}

}
