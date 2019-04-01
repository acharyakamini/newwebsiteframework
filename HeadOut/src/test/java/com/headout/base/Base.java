package com.headout.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	private static final String GECKO_DRIVER = "webdriver.gecko.driver";
	private static final String GECKO_DRIVER_LOCATION = System.getProperty("user.dir")+ "/src/test/resources"
			+ "/geckodriver";
	private static final String CHROME_DRIVER = "webdriver.chrome.driver";
	private static final String CHROME_DRIVER_LOCATION = System.getProperty("user.dir")+ "/src/test/resources"
			+ "/chromedriver";
	
	
	public Base(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/com/headout"
					+ "/base/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@BeforeSuite
	public void initialization(){
		String browserName = prop.getProperty("BROWSER");
		if(browserName.equals("chrome")){
			System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("firefox")){
			driver = getFireFoxDriver(); 
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("HOME_PAGE_URL"));
	}
	
	
	@AfterSuite
	public void termination() throws InterruptedException {
		
		//To check the last step behavior 
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}
	
	//This website is not working fine on firefox Browser
	private WebDriver getFireFoxDriver() {
		System.setProperty(GECKO_DRIVER, GECKO_DRIVER_LOCATION);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("marionette", false);
		return new FirefoxDriver(capabilities);
	}
}