package com.headout.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage{
	

	public static void searchMovie(WebDriver driver, String SEARCH_KEYWORD) {
		
		WebElement search_box = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search_box.sendKeys(SEARCH_KEYWORD);
		List<WebElement> search_results = driver.findElements(By.className("item"));
		
		if(search_results.size()>0)
			selectMovie(driver,SEARCH_KEYWORD,search_results);
		else
			System.out.println("Movie Not Found");
	
	}

	public static void selectMovie(WebDriver driver) {

		WebElement bookNowBtn = driver.findElement(By.xpath("//div[@class='button']"));
		
		//Using JavascriptExecutor because Element is not clickable using element locators
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", bookNowBtn);
		
		try {
		ArrayList<String> availableWindows = new ArrayList<String>(driver.getWindowHandles()); 
		driver.switchTo().window(availableWindows.get(1));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	private static String getText(WebElement e)
	{
	    String text = e.getText().trim();
	    List<WebElement> children = e.findElements(By.xpath("./*"));
	    for (WebElement child : children)
	    {
	        text = text.replaceFirst(child.getText(), "").trim();
	    }
	    return text;
	}
	
	private static void selectMovie(WebDriver driver, String SEARCH_KEYWORD, List search_results) {
		
		//Checking all the results. If there is an addition with the current SEARCH_KEYWORD also it will work
		for(int i=1; i<=search_results.size(); i++) {
			WebElement title = driver.findElement(By.xpath("(//div[@class='item']/div[2])["+i+"]"));
			String search_result = getText(title);			
			if(search_result.equals(SEARCH_KEYWORD)) {
				title.click();
				break;
			}
		}
		
		//If Movie name check not required than can try this
		//driver.findElement(By.xpath("//div[@class='item']/div[2]")).click();
		
	}

}
