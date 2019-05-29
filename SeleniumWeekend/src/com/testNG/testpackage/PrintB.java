package com.testNG.testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintB {
	@Test
	public void printB(){
		Reporter.log("printB", true);
	}
	
}
