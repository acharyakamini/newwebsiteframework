package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseTest;

public class JavascriptExecutorDemo  extends BaseTest{

	@Test
	public void executeJavaScript(){
		JavascriptExecutor jeExecutor =(JavascriptExecutor) driver;
		//enter "admin" in to username textbox
		jeExecutor.executeScript("document.getElementById('username').value='admin'");
		//enter "manager" in to password textbox
		jeExecutor.executeScript("document.getElementsByName('pwd')[0].value='manager'");

		//click on login button
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		jeExecutor.executeScript("arguments[0].click()", loginButton);


	}


}
