package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathDemo extends BaseClass{
	public static void main(String[] args) {
		driver.get("https://www.facebook.com");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kamini.acharya@gmail.com");

		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("kaminidsad");
		
		//driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten account')]")).click();
		
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
	}


}
