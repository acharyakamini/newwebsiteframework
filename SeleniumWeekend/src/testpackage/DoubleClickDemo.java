package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo extends BaseClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement value = driver.findElement(By.id("username"));
		value.sendKeys("kamini");
		Actions action = new Actions(driver);
		action.doubleClick(value).perform();
		
		Thread.sleep(3000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		
		
	}
}
