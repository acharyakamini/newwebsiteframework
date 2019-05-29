package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDemo extends BaseClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement findElement = driver.findElement(By.linkText("actiTIME Inc."));
		Actions action = new Actions(driver);
		action.contextClick(findElement).perform();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		
	}
	

}
