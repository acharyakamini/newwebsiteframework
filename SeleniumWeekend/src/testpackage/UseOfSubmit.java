package testpackage;

import org.openqa.selenium.By;

public class UseOfSubmit extends BaseClass {

	public static void main(String[] args) {
		//click on login using submit
		
		driver.get("https://demo.vtiger.com/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		

	}

}
