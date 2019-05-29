package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;

public class May12FileUploadPopup extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.manage().window().fullscreen();
		driver.get("https://stg-hulk2.urbanladder.com/dms/rdd");
		driver.findElement(By.id("userName")).sendKeys("dummy-vp-user@urbanladder.com");
		driver.findElement(By.id("password")).sendKeys("test1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
      WebElement element =  driver.findElement(By.xpath("//p[text()='Click or drag CSV to this area to upload.']"));
      element.click();
      System.out.println("CLICK PASSED");
      
		try
		{ Thread.sleep(15000);
		
		element.sendKeys("/Users/kamini/Downloads/requested delivery date - Sheet1 (5).csv");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
