package com.testNG.testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
	public void createUser(){
		Reporter.log("createUser", true);
	}
	public void editUser(){
		Reporter.log("editUser", true);
	}



}




