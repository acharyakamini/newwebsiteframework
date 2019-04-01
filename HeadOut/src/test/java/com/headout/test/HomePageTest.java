package com.headout.test;

import org.testng.annotations.Test;

import com.headout.base.Base;
import com.headout.pages.HomePage;

public class HomePageTest extends Base {
	
	@Test
	public void searchMovie() {
		
		HomePage.searchMovie(driver,prop.getProperty("SEARCH_KEYWORD"));
		
	}
	
	@Test
	public void selectMovie() throws InterruptedException {

		HomePage.selectMovie(driver);
		
	}

}
