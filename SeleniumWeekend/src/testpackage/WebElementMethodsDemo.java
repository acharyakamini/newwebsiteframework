package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/kamini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/moolya/login.do");
		WebElement UNobj = driver.findElement(By.id("username"));
		
		Point location = UNobj.getLocation();
		
		int x = location.getX();
		
		WebElement PWDobj = driver.findElement(By.name("pwd"));
		
		Point location2 = PWDobj.getLocation();
		
		int x2 = location2.getX();
		
		System.out.println(x + "==" + x2);
		//Verify the width of Username and Password 
		       
				//int UNwidth = UNobj.getSize().getWidth();
				//int PWDwidth = PWDobj.getSize().getWidth();
				//driver.close();
		
		Dimension size = UNobj.getSize();
		int width = size.getWidth();
		int width2 = PWDobj.getSize().getWidth(); 
		System.out.println(width + "==" + width2);
		
		//verify the height of username and password same or not
		int height = UNobj.getSize().getHeight();
		int height2 = PWDobj.getSize().getHeight();
		System.out.println(height + "==" + height2);
		
		//Select checkbox use of click
		WebElement checkboxObj = driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(checkboxObj.isSelected() + "checkboxObj is not selected");
		checkboxObj.click();
		//use of select
		boolean select = checkboxObj.isSelected();
		if(select){
			System.out.println("checkbox is selected");
		}else {
			System.out.println("checkbox is not selected");
		}
		
		//Verify the tooltip message displayed is correct
		String actualTooltipMsg = checkboxObj.getAttribute("tittle");
		System.out.println("actualTooltipMsg");
		if(actualTooltipMsg.equals("CDo not select if this coputer is shared")){
			System.out.println("tooltip is correct");
		}else{
			System.out.println("invalid tooltip message");
		}
			//Verify the toolTip message displayed is correct
		WebElement viewLicenseLinkObj = driver.findElement(By.id("licenseLink"));
		String actualTagName = viewLicenseLinkObj.getTagName();
		if(actualTagName.equals("a")){
			System.out.println("View Link element is a LINK");
		}else{
			System.out.println("View Link element is not a link");
		}			
		//Verify that actiTime image is a image or not
		
		//WebElement viewImage = driver.findElement(By.id("logoContainer"));
		//String actualtagName = viewImage.getTagName();
		//if(){
			//System.out.println("saas");
			//}else{
		
		//Print the version of actiTime application
		WebElement actitimeverson = driver.findElement(By.xpath("//nobr[contains(text(),'actTime'"));
		String text = actitimeverson.getText();
		System.out.println("version of actitime is : "+ actitimeverson);
		
		
		
	}

}
