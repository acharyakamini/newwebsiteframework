package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo extends BaseClass {
public static void main(String[] args) {
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
	WebElement srcBlock1= driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement dstBlock3= driver.findElement(By.xpath("//h1[text()='Block 3']"));
	
	Actions action = new Actions(driver);
	action.dragAndDrop(srcBlock1, dstBlock3).perform();
	
}
}
