package com.testNG.testpackage;

import org.testng.annotations.Test;

import testpackage.BaseClass;

public class TestLogin extends BaseClass{
	@Test
	public void testLogin() throws InterruptedException{
		driver.get("https://demo.actitime.com/login.do");
		LoginPage lg = new LoginPage(driver);
		lg.setUsername("admin123");
		lg.setPassword("manager123");
		lg.clickLogin();
		Thread.sleep(3000);
		//After refresh page
		lg.setUsername("admin");
		lg.setPassword("manager");
		lg.clickLogin();
		
		
		
		
	}

}
