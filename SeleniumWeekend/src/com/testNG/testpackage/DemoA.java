package com.testNG.testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	
	@Test(groups={"user","smoke"})
	public static void createUser(){
		Reporter.log("createUser", true);
		
	}
	@Test(groups={"user","regression"})
	public static void editUser(){
		Reporter.log("editUser", true);
		
	}
	@Test(groups={"user","regression"})
	public static void deleteUser(){
		Reporter.log("delteUser", true);
		
	}
	@Test(groups={"user","smoke"})
	public static void createProduct(){
		Reporter.log("createProduct", true);
		
	}
	@Test(groups={"user","regression"})
	public static void editProduct(){
		Reporter.log("editProduct", true);
		
	}
	@Test(groups={"user","regression"})
	public static void deleteProduct(){
		Reporter.log("deleteProduct", true);
		
	}
}
