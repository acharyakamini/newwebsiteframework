package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementMethodDemo extends BaseClass {
	public static void main(String[] args) {
		
		driver.get("https://www.facebook.com");
		WebElement usernameTB = driver.findElement(By.id("email"));
		usernameTB.sendKeys("kamini.acharya@gmail.com");
		
		
		WebElement passwordTB = driver.findElement(By.id("pass"));
		passwordTB.sendKeys("xyz");
		
		//WebElement loginBT = driver.findElement(By.id("u_0_2"));
		//loginBT.click();
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.cssSelector("[value=Log In]")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten account")).click();
		
		
	}

}