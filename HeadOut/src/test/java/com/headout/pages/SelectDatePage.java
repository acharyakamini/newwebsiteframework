package com.headout.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectDatePage {
	
public static void selectDate(WebDriver driver) {
		
		driver.findElement(By.xpath("(//div[@class='date-big-wrapper   '])[1]")).click();
	
	}

}
