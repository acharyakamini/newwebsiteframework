package com.headout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectSeatPage {

	public static void selectSeat(WebDriver driver) {
		
		WebElement iframeSwitch = driver.findElement(By.xpath("//iframe[@marginwidth='0']"));
		driver.switchTo().frame(iframeSwitch);
		driver.findElement(By.xpath("(//*[@class='seat bookable' and name()='circle'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='next-button selectable']")).click();
		
	}

}
