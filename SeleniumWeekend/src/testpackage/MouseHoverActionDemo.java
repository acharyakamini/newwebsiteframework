package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionDemo extends BaseClass {
	public static void main(String[] args) {
		driver.get("http://www.istqb.in/");
		WebElement foundationObj = driver.findElement(By.linkText("FOUNDATION"));
		Actions action =new Actions(driver);
		action.moveToElement(foundationObj).perform();
		
	}

}
