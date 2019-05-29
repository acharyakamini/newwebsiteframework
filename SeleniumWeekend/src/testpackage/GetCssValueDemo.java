package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class GetCssValueDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://online.actitime.com/moolya/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		WebElement errMsgObj = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
		
		//verify whether the error message is displayed or not
		boolean displayed = errMsgObj.isDisplayed();
		if(displayed){
			System.out.println("Error message is displayed");
			System.out.println("Error message is :--" + errMsgObj.getText());
		}else{
			System.out.println("Error message is not displayed");
		}
		// Verify error message is displayed in RED color
		String colorValue = errMsgObj.getCssValue("color");
		System.out.println("INITIAL Color Code"+ colorValue);
		String ColorasHex = Color.fromString(colorValue).asHex();
		System.out.println("Hexa color value" + ColorasHex);
		if(ColorasHex.equals("#ce0100"))
		{
			System.out.println("Valid color-red");
		}else{
			System.out.println("Invalid color");
		}
		driver.close();
		}
	}


