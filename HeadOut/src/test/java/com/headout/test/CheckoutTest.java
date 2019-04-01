package com.headout.test;

import org.testng.annotations.Test;

import com.headout.base.Base;
import com.headout.pages.CheckoutPage;

public class CheckoutTest extends Base {
	
	@Test
	public void checkoutDetails() {
		
		CheckoutPage.userDetails(driver,prop.getProperty("FIRST_NAME"),prop.getProperty("LAST_NAME"),prop.getProperty("EMAIL"),prop.getProperty("PHONE_NUMBER"));
		CheckoutPage.cardDetails(driver,prop.getProperty("CARD_NUMBER"),prop.getProperty("EXPIRY_DATE"),prop.getProperty("CVV"),prop.getProperty("CARD_HOLDER"));		
		CheckoutPage.proceed(driver);
	}

}
