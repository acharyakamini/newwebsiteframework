package com.headout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	public static void userDetails(WebDriver driver, String fName, String lName, String email, String phoneNumber) {
		
		driver.findElement(By.xpath("//input[@name='First Name']")).sendKeys(fName);
		driver.findElement(By.xpath("//input[@name='Last Name']")).sendKeys(lName);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='Confirm Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys(phoneNumber);
		
	}

	public static void cardDetails(WebDriver driver,String cardNumber, String expiry, String cvv, String name) {
		
		driver.findElement(By.id("card-number")).sendKeys(cardNumber);
		driver.findElement(By.id("card-expiry")).sendKeys(expiry);
		driver.findElement(By.id("card-cvv")).sendKeys(cvv);
		driver.findElement(By.id("card-name")).sendKeys(name);
	}

	public static void proceed(WebDriver driver) {
		driver.findElement(By.xpath("(//div[@class='product-checkout-button hero-button'])[1]")).click();
		
	}

}
