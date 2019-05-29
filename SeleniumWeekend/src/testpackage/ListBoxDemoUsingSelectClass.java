package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDemoUsingSelectClass extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///Users/kamini/Desktop/ListBox.html");
		WebElement listBoxObj = driver.findElement(By.id("mtr"));
		Select s = new Select(listBoxObj);
		List<WebElement> allOptions = s.getOptions();
		System.out.println("Total no. of element in list box is :" +allOptions.size());
		System.out.println("Print all the options present in the list box");
		for(WebElement option : allOptions){
			System.out.println(option.getText());
		}
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("Poori");
		s.selectByValue("d");
		System.out.println("Print all the selected options present in the list box");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println("Total no. of select elements :" +allSelectedOptions.size());
		for(WebElement option : allSelectedOptions){
			System.out.println(option.getText());
		}
		System.out.println("First selected option is IDLY: " +s.getFirstSelectedOption().getText());
		s.deselectByIndex(0);
		System.out.println("First selected option is VADA: " +s.getFirstSelectedOption().getText());
		s.deselectByValue("v");
		System.out.println("First selected option is Poori : " +s.getFirstSelectedOption().getText());
		s.deselectByVisibleText("Poori");
		System.out.println("check the list box is single select or multi select");
		
		boolean multiple = s.isMultiple();
		if (multiple){
			System.out.println("Multi select list box");
		}else {
			System.out.println("single select list box");
		}
		Thread.sleep(2000);
	}

}
