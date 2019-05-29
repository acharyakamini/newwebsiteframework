package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsDemo extends BaseClass{	
	public static void main(String[] args) {
		driver.get("https://demo.actitime.com/login.do");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total links on page is : " + allLinks.size());
		for (WebElement link : allLinks) {
			if(link.getText().equals("actiTIME Inc.")){
				link.click();
			}
		}
		driver.close();
	}
	

}
