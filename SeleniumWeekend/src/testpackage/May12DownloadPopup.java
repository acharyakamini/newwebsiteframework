package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class May12DownloadPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/kamini/Documents/geckodriver");
		FirefoxProfile profile = new FirefoxProfile();
		
		String key = "browser.helperApps.neverAsk.saveToDisk";
		String value = "application/zip";
		profile.setPreference(key, value);
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(option);
		driver.get("https://www.seleniumhq.org/download/");
		String xpath = "//td[text()='Java']/following-sibling::td/a[text()='Download']";
		driver.findElement(By.xpath(xpath)).click();
		
	}

}
