package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClassDemo extends BaseClass {
	
	public static void main(String[] args) throws AWTException 
	{
		driver.get("https://ww.google.com/");
		
		Robot r = new Robot();
		//press Control key from keyboard
		r.keyPress(KeyEvent.VK_CONTROL);
		
		//press P key from keyboard
		r.keyPress(KeyEvent.VK_P);	
		
		
		
	}

}
