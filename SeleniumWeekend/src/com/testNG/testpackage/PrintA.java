package com.testNG.testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintA {
	@Test
	public void printA(){
		Reporter.log("printA", true);
	}
	

}
