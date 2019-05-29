package com.testNG.testpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridDemo {
	public static void main(String[] args) throws MalformedURLException {
		URL whichSystem= new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities whichBrowser = new DesiredCapabilities();
		whichBrowser.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(whichSystem, whichBrowser );
		driver.get("http://localhost:8080/login.do");
	}

}
