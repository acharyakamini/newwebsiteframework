package com.headout.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.headout.base.Base;
import com.headout.pages.SelectSeatPage;

public class SelectSeatTest extends Base {
	
	@Test
	public void selectSeat() {
		
		SelectSeatPage.selectSeat(driver);
		
	}

}
