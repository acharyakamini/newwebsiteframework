package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathExample extends BaseClass{
	public static void main(String[] args) {
		
		driver.get("https://www.seleniumhq.org/download/");
		//String text2 = driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).getText();
		
		String text3 = driver.findElement(By.xpath("//td[text()='Java']/following-sibling::td/a[text()='Download']")).getText();
		
		
		//WebElement version = driver.findElement(By.xpath("//tr[1]//td[text()='Java']/../td[2]"));
		//String text = version.getText();
		System.out.println("Current version of selenium is : "+text3);
		
		//When text will change
		
		//System.out.println(driver.findElement(By.xpath("//tr[1]//td[contains(text(),'3.11')]")).getText());
		
		driver.close();
		
	}

}
