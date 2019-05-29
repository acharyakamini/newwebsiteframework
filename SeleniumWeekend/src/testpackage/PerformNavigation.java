package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformNavigation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/kamini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		Navigation nav = driver.navigate();
		nav.to("http://www.facebook.com");
		driver.get("http://www.gmail.com");
		nav.back();
		nav.forward();
		nav.refresh();		
		
	}

}
