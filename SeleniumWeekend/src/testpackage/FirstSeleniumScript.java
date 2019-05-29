package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","/Users/kamini/Documents/geckodriver");
		System.setProperty("webdriver.chrome.driver","/Users/kamini/Documents/chromedriver");
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		// enter the url - facebook
		driver.get("http://www.facebook.com");
		//print the title of the page
		String title = driver.getTitle(); //CTRL+1+Enter
		System.out.println("Title is:"+ title);
		//print the current url of the current page
		String url = driver.getCurrentUrl();
		System.out.println("URL is : "+ url);
		//close the browser
		driver.close();
		
		
	}
	

}
