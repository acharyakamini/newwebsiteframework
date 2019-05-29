package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/kamini/Documents/geckodriver");
		FirefoxProfile profile = new FirefoxProfile();
		String key ="browser.helperApps.neverAsk.saveToDisk";
		String value= "application/zip";
		profile.setPreference(key, value);
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.seleniumhq.org/download/");
		
	}

}
