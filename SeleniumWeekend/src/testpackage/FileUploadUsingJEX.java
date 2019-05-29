package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class FileUploadUsingJEX extends BaseClass {
	public static void main(String[] args) throws InterruptedException  {
		driver.manage().window().fullscreen();
		driver.get("https://stg-hulk2.urbanladder.com/dms/rdd");
		driver.findElement(By.id("userName")).sendKeys("dummy-vp-user@urbanladder.com");
		driver.findElement(By.id("password")).sendKeys("test1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		//getElementByXpath("//p[text()='Click or drag CSV to this area to upload.']"
		js.executeScript("document.getElementByXpath(//p[text()='Click or drag CSV to this area to upload.'].click().value='/Users/kamini/Downloads/requested delivery date - Sheet1 (5).csv';");
	}
}
