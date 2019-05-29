package generic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	public WebDriver driver;
	static {
		
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	@BeforeMethod
	public void openApplication(){
		driver = new ChromeDriver();
		String url = Lib.getPropertyValue("URL");
		driver.get(url);
		String implicitWait = Lib.getPropertyValue("ITO");
		//to pass long as string we used Long.parseLong(implicitWait)
		driver.manage().timeouts().implicitlyWait(Long.parseLong(implicitWait), TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApplication(ITestResult res){
		if(ITestResult.FAILURE==res.getStatus()){
		Lib.captureScreenshot(driver, res.getName());
		
	}
		}
}