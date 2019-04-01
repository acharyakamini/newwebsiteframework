package com.headout.test;

import org.testng.annotations.Test;

import com.headout.base.Base;
import com.headout.pages.SelectDatePage;

public class SelectDateTest extends Base {
	
	@Test
	public void selectDate() {
		SelectDatePage.selectDate(driver);
	}

}
