package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	//set the path of driver executables

	static{
		System.setProperty("webdriver.chrome.driver","/Users/kamini/Documents/chromedriver");
	}
	//launch the browser
	protected static WebDriver driver= new ChromeDriver();


}
