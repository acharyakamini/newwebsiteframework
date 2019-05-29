package testpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotDemo extends BaseClass {
	
	public static void main(String[] args) throws IOException {
	driver.get("https://www.googl.co.in/");
	 TakesScreenshot ts = (TakesScreenshot) driver;
	 File srcfile = ts.getScreenshotAs(OutputType.FILE);
	 File dstfile = new File("./screenshots/google.png");
	 FileUtils.copyFile(srcfile, dstfile);	 
	
	}

}
